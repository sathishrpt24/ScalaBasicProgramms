package ExceptionHandling

class TryCatch(var a:Int, var b:Int) {
  
  var A = a;
  var B = b;
  
  def this(){
    
    this(1,0);
    println("This is no argument Auxilary constructor");
  }
  
  def try_Function(){
    
    try{
      a/b
    }catch{
     
      case ex: ArrayIndexOutOfBoundsException => println("Random block"+ex)
      case e: ArithmeticException => println("Catch block of arithmatic: "+e);
      case _  => println("Unknown  exception thrown :");
      
    }
    finally{
      println("Try catch block is executed successfully");
    }
  }
  
  @throws(classOf[NumberFormatException])
  def throws_keyword(){
    val s1 ="sathish";
    s1.toInt;

  }
  
  def throw_KeyWord(){
    
    var age =18;
   
    try{
      
    if(age<19){
      
      throw new ArithmeticException("Not eligible for vote");
    }
    else println("Eligible to cast their vote");
    
    }catch {
      
      case e:ArithmeticException=>println("Throw keyword function is executed successfully"+e);
    }
    
  }
  
}

object test1{
  
  def main(args:Array[String]){
   
    val tc = new TryCatch(1,0);
    
    tc.try_Function();
    tc.throw_KeyWord();
    try{
      tc.throws_keyword();
      
    }catch{
      
      case e: NumberFormatException=> println("Exception handled here :"+e);
    }
    
    
  }
}