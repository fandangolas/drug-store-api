(ns drug-store-api.core
  (:require [io.pedestal.http :as http]
            [clojure.tools.namespace.repl :refer [refresh]]
            [drug-store-api.drugs])
  (:gen-class))

(defn respond-hello [request]
  {:status 200
   :body   "Hello, World!"})

(def routes
  #{["/hello" :get `respond-hello]
    ["/drugs" :get drug-store-api.drugs/all-drugs
              :route-name
              :get-drugs]})

(def service-map
  {::http/routes routes
   ::http/type   :jetty
   ::http/port   8890})
   
;; For interactive development
(defonce server (atom nil))
(defn go []
  (reset! server
          (http/start (http/create-server
                       (assoc service-map
                              ::http/join? false))))
  (prn "Server started on localhost:8890")
  (prn "Enter (reset) to reload.")
  :started)
(defn halt []
  (http/stop @server))
(defn reset []
  (halt)
  (refresh :after 'drug-store-api.core/go))

(defn -main [& args]
  (go))



