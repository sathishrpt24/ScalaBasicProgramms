package Constructor

class AuxilaryConstructor(var studentName:String,var rollNo:Int,var totalmarks:Int) {
       
    println("This is primary constructor call");
  
    def this(){
    this("Sathish",2009508024,500);
    println("This is default Auxilary constructor");
    
    println("Auxilary constructor calling from primary constructor:");
   
    println("The studentName is:"+studentName);
    println("The rollNo is:"+rollNo);
    println("The total mark is:"+totalmarks);
    
     println("     ------    ");
  }
  
    def this(totalmarks:Int){
    this();
    println("This is parameterised Auxilary constructor");
    println("parameterised Auxilary constructor calling from no parameter Auxilary constructor:");
    
    println("The studentName is:"+studentName);
    println("The rollNo is:"+rollNo);
    println("The total mark is:"+totalmarks);
    println("     ------    ");
  }
  
    def this(rollNo:Int,totalmarks:Int){
    this(totalmarks:Int);
    println("This is 1< parameterised Auxilary constructor");
    println("parameterised Auxilary constructor calling from  parameter Auxilary constructor:");
 
    println("The studentName is:"+studentName);
    println("The rollNo is:"+rollNo);
    println("The total mark is:"+totalmarks);
       println("     ------    ");
  }
  
}