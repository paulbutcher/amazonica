(defproject amazonica "0.2.29"
  :description "A comprehensive Clojure client for the entire Amazon AWS api."
  :url "https://github.com/mcohen01/amazonica"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :java-source-paths ["src/main/java"]
  :javac-options ["-target" "1.6" "-source" "1.6"]
  :target-path "target"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/algo.generic "0.1.2"]
                 [com.amazonaws/aws-java-sdk "1.8.5"]
                 [com.amazonaws/amazon-kinesis-client "1.1.0"]
                 [joda-time "2.2"]
                 [robert/hooke "1.3.0"]
                 [com.taoensso/nippy "2.5.0"]])