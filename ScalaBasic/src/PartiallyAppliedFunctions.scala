import java.util.Date

object PartiallyAppliedFunctions {

  def log(date:Date, Message:String){
    
    println(date + " "+Message);
  }
  
  def main(args: Array[String]) {

    val date = new Date;
    
    val newlog = log(date,_:String)
        
    newlog("Message 1");
    println(newlog("Message 2"));
    println(newlog("Message 3"));
    println(newlog("Message 4"));
    println(newlog("Message 5"));
  }

}