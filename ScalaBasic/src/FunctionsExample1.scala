

object FunctionsExample1 {
  
  def add(x:Int, y:Int):Int = {
        x + y;
  }
  
   def add1(x:Int, y:Int):Int = x + y;
  
   def subtract(x:Int, y:Int):Int = {
        x - y;
  }
   
   def subtract1(x:Int, y:Int):Int = x-y;
     
  def multiply(x:Int, y:Int):Int = {
        x * y;
  }
  
   def divide(x:Int, y:Int):Int = {
        x / y;
  }
  
  def main(args:Array[String]){
    
   println("Addition:"+ add(45,15));
     println("subtract:"+ subtract(45,15));
      println("multiply:"+ multiply(45,15));
       println("divide:"+ divide(45,15));
       println("Addition1:"+ add1(45,15));
     println("subtract1:"+ subtract1(45,15));
  }
}