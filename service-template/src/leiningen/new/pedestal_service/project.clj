(defproject {{raw-name}} "0.0.1-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [io.pedestal/pedestal.service "0.3.2-NUBANK"]

                 ;; Remove this line and uncomment one of the next lines to
                 ;; use Tomcat or Immutant instead of Jetty:
                 [io.pedestal/pedestal.jetty "0.3.2-NUBANK"]
                 ;; [io.pedestal/pedestal.tomcat "0.3.2-NUBANK"]
                 ;; [io.pedestal/pedestal.immutant "0.3.2-NUBANK"]

                 [ch.qos.logback/logback-classic "1.1.2" :exclusions [org.slf4j/slf4j-api]]
                 [org.slf4j/jul-to-slf4j "1.7.7"]
                 [org.slf4j/jcl-over-slf4j "1.7.7"]
                 [org.slf4j/log4j-over-slf4j "1.7.7"]]
  :min-lein-version "2.0.0"
  :resource-paths ["config", "resources"]
  :profiles {:dev {:aliases {"run-dev" ["trampoline" "run" "-m" "{{namespace}}.server/run-dev"]}
                   :dependencies [[io.pedestal/pedestal.service-tools "0.3.2-NUBANK"]]}}
  :main ^{:skip-aot true} {{namespace}}.server)

