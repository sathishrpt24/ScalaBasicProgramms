

object CurriedFunction {

  def add1(x: Int, y: Int): Int = {
    println("This is normal function");
    x + y;
  }

  def add2(x: Int) = (y: Int) => x + y;

  def add(x: Int)(y7: Int) = x + y7;

  def main(args: Array[String]) {

    println("Currying Functions");

    var sum = add(7)_; // Passing the arguments later'

    println("Curried Function type1 Addition of two values:" + sum(6));
    
    println(add2(10)(20));
    
    var res1 = add2(10);
    
    println(res1(20));

  }
}