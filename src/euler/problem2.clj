(ns euler.problem2)

(defn fib ([] (fib 1 1))
  ([x y] (lazy-seq (cons x (fib y (+ x y))))))

(reduce +(filter even? (take-while #(< % 4000000) (fib))))
