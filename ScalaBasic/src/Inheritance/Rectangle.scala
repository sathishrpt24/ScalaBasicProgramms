package Inheritance

class Rectangle extends Polygon {
  
  def area()={
    print("This is rectangle area function");
  }
  
}
  
  object Rectangle{
  def main(args:Array[String]){
    
    var r1 = new Rectangle();
    
    r1.area();
    println();
    r1.area1();
    
  }
}

