package ExceptionHandling
class InvalidAgeFunction(s: String) extends Exception(s) {}
class CustomExceeptionhandling {

  @throws(classOf[InvalidAgeFunction])
  def function1() {

    var age = 18;

    if (age < 19) {

      throw new InvalidAgeFunction("Error");
    }
    
    else("no error found");
  }

}

//object test1{
//    def main(args:Array[String]){
//    var ceh = new CustomExceeptionhandling();
//    ceh.function1();
//}
//}