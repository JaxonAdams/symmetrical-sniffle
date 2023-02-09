(ns practice.menu
  "Handles the menu with which users select which program they would like to run.")


(defn title
  "Displays the opening instructions for the program."
  []
  (println "\u001b[36m==================================================")
  (println "       Jaxon's Clojure Practice Programs")
  (println "==================================================\u001b[37m\n")
  (println "Please enter a number to make your selection. To see a list of options, enter 'info'."))


(defn get-input
  "Collects and trims user input."
  []
  (-> (read-line) clojure.string/trim))


(defn run-menu
  "This is the main function for this namespace."
  []
  (title)
  (get-input))