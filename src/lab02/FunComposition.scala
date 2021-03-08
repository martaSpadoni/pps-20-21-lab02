package lab02

object FunComposition extends App {

  def compose(f: Int => Int, g: Int => Int): Int => Int = x => f(g(x))

  println(compose(_-1, _*2)(5))
  println(compose(_+10,_/2)(2)) //11

}
