package lab02

object BTrees extends App {

  // A custom and generic binary tree of elements of type A
  sealed trait Tree[A]
  object Tree {
    case class Leaf[A](value: A) extends Tree[A]
    case class Branch[A](left: Tree[A], right: Tree[A]) extends Tree[A]

    def map[A,B] (a: Tree[A])(branchMapper: (B, B) => B)(leafMapper: A => B): B = a match {
      case Branch(l, r) => branchMapper(map(l)(branchMapper)(leafMapper),map(r)(branchMapper)(leafMapper))
      case Leaf(e) => leafMapper(e)
    }

    def size[A](t: Tree[A]): Int = {
      map(t)((x: Int, y: Int) => x + y)(t => 1)
    }

    def find[A](t: Tree[A], elem: A): Boolean = {
      map(t)((x:Boolean, y:Boolean) => x || y)(e => e == elem)
    }

    def count[A](t: Tree[A], elem: A): Int = {
      map(t)((x: Int, y: Int) => x + y)(e => e match {
        case n if n==elem => 1
        case _ => 0
      })
    }
  }

  import Tree._
  val tree = Branch(Branch(Leaf(1),Leaf(2)),Leaf(1))
  println(tree, size(tree)) // ..,3
  println( find(tree, 1)) // true
  println( find(tree, 4)) // false
  println( count(tree, 1)) // 2

  val strTree = Branch(Branch(Leaf("a"), Branch(Leaf("b"), Leaf("c"))), Leaf("a"))
  println(size(strTree)) // 4
  println( find(strTree, "c")) // true
  println( find(strTree, "d")) // false
  println( count(strTree, "a")) // 2
}
