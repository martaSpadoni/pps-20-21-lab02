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

  def negMethod (predicate : String => Boolean) : String => Boolean = x => !predicate(x)

  val notE = negMethod(empty) //type: String => Boolean
  println(notE("foo") && !notE(""))

  def genericNeg[A](predicate:A => Boolean) : A => Boolean = x => !predicate(x)

  println("--- TEST GENERIC NEG ---")
  //it has to still working with String to Boolean predicate
  val genNotEmpty = genericNeg(empty) //type: String => Boolean
  println(genNotEmpty("foo") && !genNotEmpty(""))
  val greaterThanFive = (x:Int) => x > 5
  val lessThanFive = genericNeg(greaterThanFive)
  println(lessThanFive(3)) //true
  println(lessThanFive(10)) //false

}
