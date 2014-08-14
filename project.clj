(defproject ol3-cljs "0.1.0-SNAPSHOT"
  :description ""
  :url ""

  :license {:name ""
            :url ""}

  :plugins [[lein-cljsbuild "1.0.3"]]

  :cljsbuild {:builds [{:source-paths ["src"]
                        :compiler {:libs ["libs/ol3/src/ol"]
                                   :output-to "main.js"
                                   :optimizations :whitespace
                                   :pretty-print true
                                   :closure-warnings {:externs-validation :off
                                                      :non-standard-jsdoc :off}}}]}

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2311"]])
