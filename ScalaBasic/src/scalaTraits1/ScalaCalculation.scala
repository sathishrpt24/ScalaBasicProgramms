package scalaTraits1

class ScalaCalculation  extends traits1 with traits2 {
  
  def add(){
    
    println("Add method is executed successfully");
  }
  
  override def multi(){
    println("multi method is executed successfully");
  }
  
  override def sub(){
    println("sub method is executed successfully");
  }
  
  def divi(){
    println("div method is executed successfully");
  }
}

object ScalaCalculation {
  
  def main(args:Array[String]){
  val sc = new ScalaCalculation();
  sc.add()
  sc.divi()
  sc.multi()
  sc.sub()

}
    
}