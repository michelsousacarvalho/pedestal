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

(defproject io.pedestal/pedestal "0.3.2-NUBANK"
  :plugins [[lein-sub "0.2.3"]
            [s3-wagon-private "1.1.2"]]
  :sub ["service"
        "jetty"
        "immutant"
        "tomcat"
        "service-tools"
        "service-template"]
  :repositories  [["nu-maven" {:url "s3p://nu-maven/releases/"
                               :username [:gpg :env/artifacts_aws_access_key_id]
                               :passphrase [:gpg :env/artifacts_aws_secret_access_key]}]])

