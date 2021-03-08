package lab02

object Parity extends App {

  val parity = (x:Int) => x match {
    case n if n%2 == 0 => "even"
    case _ => "odd"
  }

  val parity2 : Int => String = {
    case n if n%2 == 0 => "even"
    case _ => "odd"
  }

  println(parity(4), parity2(4), parity(7), parity2(7))

  def parityMethod(x: Int) : String = x match {
    case n if n%2 == 0 => "even"
    case _ => "odd"
  }

  println(parityMethod(4), parityMethod(7))

}
