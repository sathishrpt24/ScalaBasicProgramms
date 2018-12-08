

object HigherOrderFunctions1 {
  
  def add(x:Int,y:Int, f:(Int,Int)=>Int): Int = {
        f(x,y);
  }
  
  def add1(x:Double,y:Double, f:(Double,Double)=>Double): Double = {
        f(x,y);
  }
  
   def add1(x:Double,y:Double,z:Double,f:(Double,Double)=>Double): Double = {
        f(f(x,y),z);
  }
  
  def main(args:Array[String]){
    
    println(add(5,6,(x,y)=>x+y));
    
    println(add1(5,6,(x,y)=>x+y));
    
    println(add1(5,6,7,(x,y)=>x+y));
    
  }
}