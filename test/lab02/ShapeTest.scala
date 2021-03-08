package lab02

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class ShapeTest {
  import Shape.Shape._

  val rect = Rectangle(10.5, 30)
  val circle = Circle(11)
  val square = Square(4)

  @Test def testPerimeter(){
    assertEquals(81, perimeter(rect))
    assertEquals(11*2*math.Pi, perimeter(circle))
    assertEquals(16, perimeter(square))
  }

  @Test def testArea(){
    assertEquals(30*10.5, area(rect))
    assertEquals(11*11*math.Pi, area(circle))
    assertEquals(16, area(square))
  }

}