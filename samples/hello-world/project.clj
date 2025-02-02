; Copyright 2013 Relevance, Inc.
; Copyright 2014 Cognitect, Inc.

; The use and distribution terms for this software are covered by the
; Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0)
; which can be found in the file epl-v10.html at the root of this distribution.
;
; By using this software in any fashion, you are agreeing to be bound by
; the terms of this license.
;
; You must not remove this notice, or any other, from this software.

(defproject hello-world "0.1.0-SNAPSHOT"
  :description "Simple hello-world service in Pedestal"
  :url "https://github.com/pedestal/pedestal/tree/master/guides"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [io.pedestal/pedestal.service "0.3.2-NUBANK"]
                 [io.pedestal/pedestal.service-tools "0.3.2-NUBANK"]
                 [io.pedestal/pedestal.jetty "0.3.2-NUBANK"]]
  :main hello-world.core)
