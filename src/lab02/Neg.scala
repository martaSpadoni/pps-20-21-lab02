package lab02

object Neg extends App{

  val neg: (String => Boolean) => String => Boolean = predicate => x => !predicate(x)

  val empty : String => Boolean = _ == ""
  val notEmpty = neg(empty) //type: String => Boolean
  println(notEmpty("foo"), notEmpty(""))
  println(notEmpty("foo") && !notEmpty(""))

  val isFoo = (str: String) => str == "foo"
  println(neg(isFoo)("pippo")) //true
  println(neg(isFoo)("foo")) //false

  def negMethod (pred : String => Boolean) : String => Boolean = x => !pred(x)

  val notE = negMethod(empty) //type: String => Boolean
  println(notE("foo") && !notE(""))

}
