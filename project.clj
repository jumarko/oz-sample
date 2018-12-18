(defproject oz-sample "0.1.0-SNAPSHOT"
  :description "Sample app to play with oz: https://github.com/metasoarous/oz"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [metasoarous/oz "1.4.0"]]
  :main ^:skip-aot oz-sample.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
