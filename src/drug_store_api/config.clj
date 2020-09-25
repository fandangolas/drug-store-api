(ns drug-store-api.config)

(def db
  {:classname "org.postgresql.Driver"
   :subprotocol "postgresql"
   :subname "//localhost:5432/postgres"
   :user "postgres"
   :password "postgres"})