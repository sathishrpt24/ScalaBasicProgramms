
//A member declared outside of the class will be used inside the function is called as closure.

object ClosurePureandImpure {
  
  var num = 100;
  val num1 = 110;
  
  def impure(x:Int) = { 
    
    println("Impure closure "+(x+num)); 
    
    // ImpureClosure- the member which declared as variable is known as pure functions.
    
  }
  
    def pure(x:Int) = { 
    
    println("Pure closure "+(x+num1)); 
    
    // pureClosure-, the member which declared as value is known as pure functions.
        
  }
  
  def main(args:Array[String]){
    
    impure(5);
    pure(5);
  }
}