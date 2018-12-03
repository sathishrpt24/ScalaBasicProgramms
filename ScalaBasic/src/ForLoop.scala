

object ForLoop {

  def main(args: Array[String]) {

    var x: Int = 0;

    for (x <- 1 to 10) {

      println("X value using to method - " + x)

    }
    //untill method
    
    //ForLoop with ranges
    for (x <- 1 until 10) {

      println("X value using until method - " + x)

    }

    //Nested for Loop

    println("********************************")

    for (x <- 1 until 10; y <- 1 until 3) {

      println("X value using nested forloop - " + x)

    }

    // For loop with if condition
    
    println("*********************")
    
    //For Loop with filters
    
    for (x <- 1 to 10 if (x != 0); if (x == 5)) {

      println("The value of x is:" + x);
    }

    // List for loop in Scala

    var tempList = List(1, 2, 34, 4, 5, 6, 7, 89)

    // Forloop with collections
    for (x <- tempList if (x != 0); if (x <= 5)) {
      println("The value of a from list is-" + x)
    }

    // ForLoop with yield method
   var newList =  for{x <- tempList if (x != 0); if (x <= 5)} yield x
   
   println("The value of new list is:- "+ newList)
  }

}