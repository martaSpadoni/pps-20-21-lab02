package lab02


object FunComposition extends App {

  def compose(f: Int => Int, g: Int => Int): Int => Int = x => f(g(x))

  println(compose(_-1, _*2)(5)) //9
  println(compose(_+10,_/2)(2)) //11

  def genericCompose[A,B,C](f: B => C, g: A => B): A => C = x => f(g(x))

  val f = (x:Int) => x match {
    case n if n >= 0 => "pos"
    case _ => "neg"
  }
  val g = (x:Int) => x-2

  println(genericCompose(f, g)(5)) //"pos"
  println(genericCompose((x:Int) => x>10,(y:Int) => y*2 )(3)) //false

}
