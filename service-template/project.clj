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

(defproject pedestal-service/lein-template "0.3.2-NUBANK"
            :plugins [[s3-wagon-private "1.1.2"]]
  :description "A Pedestal Service template."
  :url "https://github.com/pedestal/pedestal"
  :scm "https://github.com/pedestal/pedestal"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :min-lein-version "2.0.0"
  :eval-in-leiningen true
  :test-selectors {:travis (complement :not-travis)}
  :repositories  [["nu-maven" {:url "s3p://nu-maven/releases/"
                               :username [:gpg :env/artifacts_aws_access_key_id]
                               :passphrase [:gpg :env/artifacts_aws_secret_access_key]}]])
