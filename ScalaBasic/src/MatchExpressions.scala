

object MatchExpressions {
  def main(args:Array[String]){
    
    var age = 3;
    
    age match{
      
      case 1 => println("Age is:"+age);
      case 2 => println("Age is:"+age);
      case 3 => println("Age is:"+age);
      case 4 => println("Age is:"+age);
      case 5 => println("Age is:"+age);
      case _ => println(" Please enter age value between 1 to 5");
    }
    
     var Result =  age match{
      
      case 1 => age;
      case 2 => age;
      case 3 => age;
      case 4 => age;
      case 5 => age;
      case _ => println(" Please enter age value between 1 to 5");
    }
     
     println("The Result is:"+ Result);
     
     println("This is to identify the Even or Odd Number");
     
     var num = 10;
     
     num match{
       
       case 1|3|5|7|9 => println("Given number is Odd");
       
       case 2|4|6|8|0 => println("Given number is Even");
       
       case _ => println("Enter the values between 1 - 10");
     }
  }
}