package lab02


object Shapes {

  sealed trait Shape
  object Shape {

    case class Rectangle(base: Double, height: Double) extends Shape

    case class Circle(radius: Double) extends Shape

    case class Square(side: Double) extends Shape

    def perimeter(shape:Shape): Double = shape match {
      case Rectangle(b, h) => (b+h)*2
      case Circle(r) => 2*math.Pi*r
      case Square(s) => s*4
    }

    def area(shape: Shape): Double = shape match {
      case Rectangle(b, h) => b*h
      case Circle(r) => r*r*math.Pi
      case Square(s) => s*s
    }

  }

}
