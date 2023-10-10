def shadowing(e: Expr): Set[String] = helper(e, Set())

def helper(e: Expr, env: Set[String]): Set[String] = e match {
  case Num(n) => Set()
  case Add(l, r) => helper(l, env) + helper(r, env)
  case Id(x) => Set()
  case Val(x, e, b) => {
    val s = if (env(x) == true) {Set(x)} else {Set()}
    s + helper(e, env) + helper(b, env + x)
  }
}