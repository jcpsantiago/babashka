(ns babashka.impl.clojure.core
  {:no-doc true}
  (:refer-clojure :exclude [future]))

(def core-extras
  {'file-seq file-seq
   'agent agent
   'instance? instance? ;; TODO: move to sci
   'send send
   'send-off send-off
   'promise promise
   'deliver deliver
   'shutdown-agents shutdown-agents
   'slurp slurp
   'spit spit})
