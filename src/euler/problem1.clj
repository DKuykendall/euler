(ns euler.problem1)

(reduce + (filter #(or (zero? (mod % 3)) (zero? (mod % 5)) ) (range 1000)))
