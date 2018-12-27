package ScalaTraits

class Child_Class(override val Student1:String,override val mark1:Int) extends Super_Class(Student1,mark1) {

  def child_Function():Unit = {
    
    print("This is child class");
  
  }
  

}

