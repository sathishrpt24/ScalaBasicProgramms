

object ScalaMap {
  
  def main(args: Array[String]){
      
      var myMap = Map(1->"Sathish",2->"Selvarasu");
      
     println( myMap.+(3->4));
     
           
      println(myMap);
      
      println(myMap.keySet);
      
      println(myMap.values);
      
      println(myMap.seq);
      
      myMap.keys.foreach{
     
          i =>
            println("Keys: "+ i);
            println("Values: "+myMap(i));
      }
    
  }
  
}