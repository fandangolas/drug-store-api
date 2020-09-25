(ns drug-store-api.sql.drugs
  (:require [hugsql.core :as hugsql]))
  
(hugsql/def-db-fns "drug_store_api/sql/drugs.sql")

(comment 
  (do 
    (require '[drug-store-api.config :refer [db]])
    (require '[drug-store-api.sql.drugs :as sd] :reload)
    (require '[drug-store-api.drugs :as d] :reload)))