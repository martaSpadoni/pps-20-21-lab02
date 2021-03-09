package lab02

object Currying extends App {

  //curried val
  val p1: Int => Int => Int => Boolean = x => y => z => (x <= y) && (y <= z)
  //non curried val
  val p2 = (x: Int, y: Int, z: Int) => (x <= y) && (y <= z)
  //curried def
  def p3(x: Int)(y: Int)(z: Int): Boolean = (x <= y) && (y <= z)
  //non-curried def
  def p4(x: Int, y:Int, z:Int): Boolean = (x <= y) && (y <= z)

  println(p1(3)(4)(5)) //true
  println(p2(6,9,3)) //false
  println(p3(3)(5)(7))//true
  println(p4(1,2,3)) //true

  val fiveIsLessThan : Int => Int => Boolean = p1(5)
  println(fiveIsLessThan(7)(8)) //true

  val areBothLessThanTen : Int => Int => Boolean = x => y =>  p3(x)(y)(10)
  println(areBothLessThanTen(4)(12)) //false

}
