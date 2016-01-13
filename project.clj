(defproject jedesmal "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [manifold "0.1.2-alpha2"]]
  :main ^:skip-aot jedesmal.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
