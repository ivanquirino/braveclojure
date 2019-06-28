(ns braveclojure.core
  (:gen-class))

; 2. 
(defn add100 
  "Add 100 to a number"
  [value] (+ value 100)
)

; 3.
(defn dec-maker
  "decrement maker"
  [value] #(- % value)
)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "2. add 100 to value 3")
  (println (add100 3))
  (println "3. dec-maker dec9 value 10")
  (let [dec9 (dec-maker 9)] (println (dec9 10)))
)