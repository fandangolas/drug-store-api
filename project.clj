(defproject drug-store-api "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [io.pedestal/pedestal.service "0.5.7"]
                 [io.pedestal/pedestal.jetty "0.5.7"]
                 [com.layerware/hugsql "0.4.9"]
                 [org.postgresql/postgresql "42.1.4"]
                 [org.clojure/tools.namespace "0.2.11"]
                 [org.clojure/tools.logging "0.3.1"]
                 [ch.qos.logback/logback-classic "1.1.3"]]
  :repositories [["central" {:url "https://repo1.maven.org/maven2"}]
                 ["clojars" {:url "https://clojars.org/repo"}]]
  :main ^:skip-aot drug-store-api.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
