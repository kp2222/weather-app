(defproject weather-app "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [clj-http "1.1.2"]
                 [org.clojure/data.json "0.2.6"]]
  :plugins [[cider/cider-nrepl "0.8.1"]]
  :main weather-app.core/weather)
