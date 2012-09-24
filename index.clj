{:namespaces
 ({:source-url nil,
   :wiki-url "damp.qwal-api.html",
   :name "damp.qwal",
   :author "Reinout Stevens",
   :doc
   "(Quantified) regular path expressions over graphlike structures"}),
 :vars
 ({:arglists ([& goals]),
   :name "all-goals",
   :namespace "damp.qwal",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/damp.qwal-api.html#damp.qwal/all-goals",
   :doc
   "Helper function that creates a goal that solves all goals passed as argument",
   :var-type "function",
   :line 339,
   :file "src/damp/qwal.clj"}
  {:arglists ([& goals]),
   :name "q*",
   :namespace "damp.qwal",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/damp.qwal-api.html#damp.qwal/q*",
   :doc
   "goals may succeed zero to multiple times.\nShould detect loops by using tabled/slg resolution.\nq* is greedy, meaning it tries the longest path for which goals holds.\nsee q*? for the reluctant variant.\nBUG: currently greedy behaves just as the reluctant version, even though it should not.",
   :var-type "function",
   :line 88,
   :file "src/damp/qwal.clj"}
  {:arglists ([& goals]),
   :name "q*?",
   :namespace "damp.qwal",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/damp.qwal-api.html#damp.qwal/q*?",
   :doc "reluctant/non-greedy version of q*",
   :var-type "function",
   :line 108,
   :file "src/damp/qwal.clj"}
  {:arglists ([& goals]),
   :name "q+",
   :namespace "damp.qwal",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/damp.qwal-api.html#damp.qwal/q+",
   :doc "same as q*, except goals should succeed at least once",
   :var-type "function",
   :line 147,
   :file "src/damp/qwal.clj"}
  {:arglists ([& goals]),
   :name "q+?",
   :namespace "damp.qwal",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/damp.qwal-api.html#damp.qwal/q+?",
   :doc "same as q*?, except goals should succeed at least once",
   :var-type "function",
   :line 156,
   :file "src/damp/qwal.clj"}
  {:arglists ([& goals]),
   :name "q<=*",
   :namespace "damp.qwal",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/damp.qwal-api.html#damp.qwal/q<=*",
   :doc "see q*, but also calls q<= at the end of goals",
   :var-type "function",
   :line 136,
   :file "src/damp/qwal.clj"}
  {:arglists ([& goals]),
   :name "q<=+",
   :namespace "damp.qwal",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/damp.qwal-api.html#damp.qwal/q<=+",
   :doc "see q+, but also calls q<= at the end of goals",
   :var-type "function",
   :line 175,
   :file "src/damp/qwal.clj"}
  {:arglists ([& goals]),
   :name "q<=+?",
   :namespace "damp.qwal",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/damp.qwal-api.html#damp.qwal/q<=+?",
   :doc "see q+?, but also calls q<= at the end of goals",
   :var-type "function",
   :line 180,
   :file "src/damp/qwal.clj"}
  {:arglists ([& goals]),
   :name "q<=?",
   :namespace "damp.qwal",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/damp.qwal-api.html#damp.qwal/q<=?",
   :doc "see q*?, but also calls q<= at the end of goals",
   :var-type "function",
   :line 141,
   :file "src/damp/qwal.clj"}
  {:arglists ([& goals]),
   :name "q=>*",
   :namespace "damp.qwal",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/damp.qwal-api.html#damp.qwal/q=>*",
   :doc "see q*, but also calls q=> at the end of goals",
   :var-type "function",
   :line 124,
   :file "src/damp/qwal.clj"}
  {:arglists ([& goals]),
   :name "q=>*?",
   :namespace "damp.qwal",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/damp.qwal-api.html#damp.qwal/q=>*?",
   :doc "see q*?, but also calls q=> at the end of goals",
   :var-type "function",
   :line 130,
   :file "src/damp/qwal.clj"}
  {:arglists ([& goals]),
   :name "q=>+",
   :namespace "damp.qwal",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/damp.qwal-api.html#damp.qwal/q=>+",
   :doc "see q+, but also calls q=> at the end of goals",
   :var-type "function",
   :line 164,
   :file "src/damp/qwal.clj"}
  {:arglists ([& goals]),
   :name "q=>+?",
   :namespace "damp.qwal",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/damp.qwal-api.html#damp.qwal/q=>+?",
   :doc "see q+?, but also calls q=> at the end of goals",
   :var-type "function",
   :line 169,
   :file "src/damp/qwal.clj"}
  {:arglists ([& goals]),
   :name "q?",
   :namespace "damp.qwal",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/damp.qwal-api.html#damp.qwal/q?",
   :doc "goals may succeed or not",
   :var-type "function",
   :line 186,
   :file "src/damp/qwal.clj"}
  {:arglists ([[current] & goals]),
   :name "qcurrent",
   :namespace "damp.qwal",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/damp.qwal-api.html#damp.qwal/qcurrent",
   :doc
   "macro that evaluates a series of goals in the current world. current is bound to the current world",
   :var-type "macro",
   :line 328,
   :file "src/damp/qwal.clj"}
  {:arglists ([& goals]),
   :name "qfail",
   :namespace "damp.qwal",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/damp.qwal-api.html#damp.qwal/qfail",
   :doc "implementing naf using conda",
   :var-type "function",
   :line 234,
   :file "src/damp/qwal.clj"}
  {:arglists ([& goals]),
   :name "qin-current",
   :namespace "damp.qwal",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/damp.qwal-api.html#damp.qwal/qin-current",
   :doc "macro to evaluate a series of goals in the same world",
   :var-type "macro",
   :line 320,
   :file "src/damp/qwal.clj"}
  {:arglists ([times & goals]),
   :name "qtimes",
   :namespace "damp.qwal",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/damp.qwal-api.html#damp.qwal/qtimes",
   :doc "goals has to succeed times times",
   :var-type "function",
   :line 195,
   :file "src/damp/qwal.clj"}
  {:arglists ([times & goals]),
   :name "qtimes<=",
   :namespace "damp.qwal",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/damp.qwal-api.html#damp.qwal/qtimes<=",
   :doc "see qtimes, but also calls q=> at the end of goals",
   :var-type "function",
   :line 223,
   :file "src/damp/qwal.clj"}
  {:arglists ([times & goals]),
   :name "qtimes=>",
   :namespace "damp.qwal",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/damp.qwal-api.html#damp.qwal/qtimes=>",
   :doc "see qtimes, but also calls q=> at the end of goals",
   :var-type "function",
   :line 217,
   :file "src/damp/qwal.clj"}
  {:arglists ([current [& conditions] & goals]),
   :name "quntil",
   :namespace "damp.qwal",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/damp.qwal-api.html#damp.qwal/quntil",
   :doc
   "reverse of qwhile.\nGoals are executed until conditions hold in current.",
   :var-type "macro",
   :line 244,
   :file "src/damp/qwal.clj"}
  {:arglists ([graph start end bindings & exps]),
   :name "qwal",
   :namespace "damp.qwal",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/damp.qwal-api.html#damp.qwal/qwal",
   :doc
   "A macro on top of solve-qrpe that allows for nicer syntax.\nGraph holds the graph, and should at least understand :nodes, :successors and :predecessors.\nStart node must be a member of the graph.\nEnd node is assumed to be a member of the graph.\nBindings are the new introduced variables that are kept throughout the pathexpression.\nExps are the actual goals that should hold on the path through the graph.\nEach goal should be a rule that takes 2 variables.\nFirst variable is the current world, and will be ground.\nSecond variable is the next world, and goal must ground this.",
   :var-type "macro",
   :line 292,
   :file "src/damp/qwal.clj"}
  {:arglists ([current [& conditions] & goals]),
   :name "qwhile",
   :namespace "damp.qwal",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/damp.qwal-api.html#damp.qwal/qwhile",
   :doc
   "calls goals as long as conditions holds.\nCurrent is bound to the current world and can thus be used in conditions.\nNote that when & goals doesn't go to a successor zero results are found.",
   :var-type "macro",
   :line 252,
   :file "src/damp/qwal.clj"}
  {:arglists ([graph node previous]),
   :name "rev-trans",
   :namespace "damp.qwal",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/damp.qwal-api.html#damp.qwal/rev-trans",
   :doc "succeeds when previous is a direct predecessor of node",
   :var-type "function",
   :line 32,
   :file "src/damp/qwal.clj"}
  {:arglists ([graph current next goal]),
   :name "solve-goal",
   :namespace "damp.qwal",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/damp.qwal-api.html#damp.qwal/solve-goal",
   :doc
   "solves goal in the current world.\nArguments to the goal are goal, current and next.\nGoal should ground next.",
   :var-type "function",
   :line 48,
   :file "src/damp/qwal.clj"}
  {:arglists ([graph curr end goals]),
   :name "solve-goals",
   :namespace "damp.qwal",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/damp.qwal-api.html#damp.qwal/solve-goals",
   :doc
   "goals is a list of goals.\nEach goal is called, passing the next version of the previous goal as the\ncurrent version of the current goal",
   :var-type "function",
   :line 60,
   :file "src/damp/qwal.clj"}
  {:arglists ([graph start end & goals]),
   :name "solve-qrpe",
   :namespace "damp.qwal",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/damp.qwal-api.html#damp.qwal/solve-qrpe",
   :doc "main rule that solves a qrpe",
   :var-type "function",
   :line 277,
   :file "src/damp/qwal.clj"}
  {:arglists ([graph node next]),
   :name "trans",
   :namespace "damp.qwal",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/damp.qwal-api.html#damp.qwal/trans",
   :doc "succeeds when next is a direct successor of node",
   :var-type "function",
   :line 24,
   :file "src/damp/qwal.clj"})}
