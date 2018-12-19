//import scala.collection.parallel.ParIterableLike.Foreach


object ScalaList {
  
  def main(args:Array[String]){
    
    var myList  = List(1,2,3,45,6,"Sathish");
    
    println(myList);
    
    for(i<-myList){
      println(i);
    }
    
    myList.foreach(i=> println(i));
    
    var myList2 = List("Sathish","Selvarasu","Suresh","Anitha");
    
    println(myList.++(myList2));
    
 
  }
}