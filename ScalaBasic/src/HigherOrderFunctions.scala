object HigherOrderFunctions {
  
  def main(args:Array[String]){
    
    var Result = secondFunction(firstFunction(5,6));
    println(Result);
  }
  
  def firstFunction(a:Int,b:Int): Int = {
    
    a+b
    
  }
  
  def secondFunction(c:Int):Int = {
        c
  }
}    