(ns datasplash-dev-tools.core
  (:require [datasplash-dev-tools.checkpoint :as cp])
  (:import [java.nio.file Paths Files]
           [java.net URI]))

(defn read-checkpoint
  [path {:keys [format]}]
  (let [p (Paths/get (URI/create path))
        ds (Files/newDirectoryStream p)
        paths (filter cp/regular-file? (seq ds))]
    (cp/read-elements-from-paths (cp/formats format) paths)))
