package ScalaClassExample

object ObjectClass {

  def main(args: Array[String]) {

    val B = new Base(10, 20);
    
    val C = new ChildClass(1,2,3);
    
    val dem = B.addition();
    
    val dem1 = C.newAddition();
    
    val dem2 = C.addition();

    println(dem);
    
    println("The value of X is: "+B.X);
    
    println("The value of Y is: "+B.Y);
    
    println(dem1);
    
    println("The value of X is: "+C.X);
    
    println("The value of Y is: "+C.Y);
    
    println("The value of Y is: "+C.Z);
    
    println(dem2);

  }
}