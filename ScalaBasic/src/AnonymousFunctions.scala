

object AnonymousFunctions {
  
  object Maths{
    
  def +(x:Int, y:Int):Int = x + y;
  def -(x:Int, y:Int):Int = x - y;
  def *(x:Int, y:Int):Int = x * y;
  def /(x:Int, y:Int):Int = x / y;
 
  }
  
  def main(args:Array[String]){
    
    println(Maths.+(10,2));
    println(Maths -(10,2));
    println(Maths *(10,2));
    println(Maths /(10,2));
  
    // Anonymous Functions
    
    var result = (x:Int,y:Int) => x + y;
    
    println(result(5,6));
    
  }
}