package ScalaTraits

class Super_Class(val Student1: String, val mark1: Int) {

  var s1 = Student1;
  var m1 = mark1;

  def this() = {
    this("Sathish", 200);
    println("This is auxillary constructor");
  }

  def student_details(): Int = {
    println("The Student details are: %s and %d ".format(s1, m1));
    m1
  }

}