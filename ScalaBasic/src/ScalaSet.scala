

object ScalaSet {
  
  
  def main(args:Array[String]){
      
    var mySet = Set(1,2,3,4,54,6,7,8);
    
    var mySet1 = Set("Sathish","Selvarasu","Suresh","Ramesh",2);
    println(mySet);
    println(mySet1);
    println(mySet.contains(2));
    println(mySet1.contains("Selvarasu"));
    println(mySet.head);
    println(mySet1.head);
    println(mySet.tail);
    println(mySet1.tail);
    
    mySet.foreach(a=>println(a));
    mySet1.foreach(f=>println(f));
    
    println(mySet(54));  // will check the value exisitance in the given set of values
    
    println(mySet.seq)
    
    println(mySet.+(12))
    
    println(mySet)
    
    println(mySet.++:(mySet1));
    
    println(mySet1.iterator);
    
  }
}