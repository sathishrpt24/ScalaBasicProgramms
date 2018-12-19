

object Tuples {
  
  def main(args:Array[String]){
    
    var temp = (1,2,3,4,5,1,2,3);
    
    var temp1 = new Tuple11(1,2,3,4,5,6,7,8,1,2,3);
    
    println(temp1);
    
    temp1.productIterator.foreach(i =>println(i));
    
   // var test = temp1.+("Sathish");
    
    //println(test);
    
    
  }
}