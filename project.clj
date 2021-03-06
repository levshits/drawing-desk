(defproject drawingdesk "0.1.0-SNAPSHOT"
  :description "Drawing desk"
  :url "levshits.github.io/drawing-desk"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.229"]
                 [org.clojure/data.json "0.2.6"]
                 [org.clojure/tools.logging "0.3.1"]
                 [ring "1.5.0"]
                 [ring-cors "0.1.8"]
                 [ring/ring-json "0.4.0"]
                 [compojure "1.5.1"]
                 [http-kit "2.2.0"]
                 [buddy "1.2.0"]
                 [clj-time "0.12.2"]
                 [com.novemberain/monger "3.1.0"]]
  :dev-depelendencies [[lein-cljsbuild "1.1.4"]
                       [lein-ring "0.9.7"]]
  :plugins [[lein-ring "0.9.7"]]
  :main drawing.main
  :ring {:handler drawing.main/app
         :uberwar-name "server.war"
         :auto-reload? true
         :auto-refresh? true}
  )
