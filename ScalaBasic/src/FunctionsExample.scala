

object FunctionsExample {

  def main(args: Array[String]) {

    firstFunction1();
  //  println("Result from function1"+Result);
    var Result = function2(5, 6);
    println("Result from function2"+Result);
    var Result1 = function3("Sathish ", "Ponnusamy");
    println("Result from function3"+Result1);
    var Result2 = function4(b = "Sathish ", a = "Ponnusamy");
    println("Result from function4"+Result2);
  }

  def firstFunction1() {

    println("This is my first programm");

  }

  def function2(a: Int, b: Int): Int = {

    a + b
  }

  def function3(a: String, b: String): String = {

    a + b
  }

  def function4(a: String, b: String): String = {

    a + b
  }
}