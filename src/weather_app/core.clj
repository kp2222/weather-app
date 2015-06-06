(ns weather-app.core
  (:require [clj-http.client :as client])
  (:require [clojure.data.json :as json]))



(defn weather 
  "weather for city"
  [city metric]
  (let [weather-response-from-service (client/get (str "http://api.openweathermap.org/data/2.5/weather?q=" city "&units=" metric))
        weather-data (json/read-str (weather-response-from-service :body) :key-fn keyword )
        city-found (= 200 (weather-data :cod))
        temparature (get-in weather-data [:main :temp])
        ]
    (if city-found
      (do (println temparature))
      (println "not found"))))
  
