(ns jedesmal.core
  (:require
   [manifold.time :as mt])
  (:gen-class))

(defn ^:private doit
  []
  (mt/every
   1000
   0
   #(prn "I work")))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (doit))
