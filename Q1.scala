case class Point(x: Int, y: Int) {

  def +(that: Point): Point = {

    Point(this.x + that.x, this.y + that.y);

  }

  def move(dx: Int, dy: Int): Point = {
    Point(this.x + dx, this.y + dy);
  }

  def distance(that: Point): Any = {
    var a = (that.x - this.x) * (that.x - this.x);
    var b = (that.y - this.y) * (that.y - this.y);
    var c = scala.math.sqrt(a + b);
    println("Distance = " + c);
  }

  def invert(): Point = {
    Point(this.y, this.x);
  }
}

object Q1 {
  def main(args: Array[String]) {

    val p1 = Point(1, 2);
    val p2 = Point(2, 3);

    println(p1 + p2);
    println(p1.move(5, 6));
    p1.distance(p2);
    println(p1.invert());

  }
}