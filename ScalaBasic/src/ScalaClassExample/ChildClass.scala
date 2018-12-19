package ScalaClassExample

class ChildClass(override val x:Int,override val y:Int,val z:Int) extends Base(x,y) {
  
   var Z = z;
   
   def newAddition():Int = {
     
     println("Adding three numbers");
     
     X+Y+Z;
   }
}