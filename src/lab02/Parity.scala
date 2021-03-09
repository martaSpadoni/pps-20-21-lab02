package lab02

object Parity extends App {

  val parity : Int => String = {
    case n if n%2 == 0 => "even"
    case _ => "odd"
  }

  println(parity(4), parity(7))

  def parityMethod(x: Int) : String = x match {
    case n if n%2 == 0 => "even"
    case _ => "odd"
  }

  println(parityMethod(4), parityMethod(7))

}
