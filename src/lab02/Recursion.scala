package lab02

object Recursion extends App{

  def fib(n: Int): Int = {
    @annotation.tailrec
    def tailFib(fib: Int, prev: Int, n: Int):Int = n match {
      case 0 => 0
      case 1 => fib
      case _ => tailFib(fib+prev, fib, n-1)
    }
    tailFib(1, 0, n)
  }

  println(fib(0), fib(1), fib(2), fib(3), fib(4), fib(5)) //(0,1,1,2,3,5)

}
