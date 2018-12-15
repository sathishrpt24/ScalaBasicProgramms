

object MdArray {
  
  def main(args:Array[String]){
    
    var mdarray = Array.ofDim[Int](2,3);
   // println(mdarray.size);
    
    mdarray(0)(0)=10;
    mdarray(0)(1)=11;
    mdarray(0)(2)=12;
    mdarray(1)(0)=20;
    mdarray(1)(1)=21;
    mdarray(1)(2)=22;
    
    for(i<- 0 to 1)
    {
      for(j<- 0 to 2){
        
        print(mdarray(i)(j)+" ");
      }
        println();
    }
   }
}