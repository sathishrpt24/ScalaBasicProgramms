

object ForLoop {

  def main(args: Array[String]) {

    var x: Int = 0;

    for (x <- 1 to 10) {

      println("X value using to method - " + x)

    }
    //untill method
    for (x <- 1 until 10) {

      println("X value using until method - " + x)

    }

    //Nested for Loop

    println("********************************")

    for (x <- 1 until 10; y <- 1 until 3) {

      println("X value using nested forloop - " + x)

    }
  }

}