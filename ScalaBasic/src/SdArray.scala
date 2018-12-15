

object SdArray {
  
  def main(args:Array[String]){
    
    var arr = new Array[Int](5);
    var arr1:Array[Int] =  new Array(6);
    var arr2:Array[Int] =  new Array[Int](6);
    var arr3 =  Array(1,2,3,4,5,6,7,8)
    
   //var test =
    
    println(arr);
    println(arr1);
    println(arr2);
    println(arr3);
    
    //println(arr);
    for(a<-arr)
      println(a);
    
    for(a<-arr1)
      println(a);
    
    for(a<-arr2)
      println(a);
    for(a<-arr3)
      println(a);
    
    val ts = arr.length
    println("Length of array is :"+ts);
    println(arr.lengthCompare(5));
   SdArray.show(arr);
   SdArray.show1(arr3);
  }
  
  def show(arr:Array[Int]){
    
    println("Testing of Array as an argument");
    
    for(a<-arr)      
      println(a);
    
   }
  
    def show1(arr3:Array[Int]){
    
    println("Testing of Array as an argument");
    
    arr3.foreach((Element:Int)=>println(Element));
    
    }
 
}
