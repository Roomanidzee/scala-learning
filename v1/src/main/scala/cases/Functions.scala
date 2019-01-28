package cases

class Functions {

  def simplifyTop(expr: Expr): Expr = expr match {

    case UnOp("-", UnOp("-", e)) => e
    case BinOp("+", e, Number(0)) => e
    case BinOp("*", e, Number(1)) => e
    case _ => expr

  }

  def generalSize(x: Any): Int = x match {

    case s: String => s.length
    case m: Map[_, _] => m.size
    case _ => -1

  }

}
