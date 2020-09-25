(ns drug-store-api.drugs
  (:require [drug-store-api.sql.drugs :as sql]
            [drug-store-api.config :refer [db]]
            [io.pedestal.http :as http]))

(defn all-drugs [_]
  (http/json-response (sql/drugs db)))