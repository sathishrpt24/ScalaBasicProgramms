

object StringOperations {
  
  val num = 5;
  val num1 =  10.5;
  val str1 = "Sathish";
  val str2 = "Ponnusamy";
  
  def main(args:Array[String]){
    
    val res = printf("(%d--%f---%s)",num,num1,str1);
    
    println(res);
    
    println("value of num is%d and num1 is %f and Str1 is %s".format(num,num1,str1));
    
    //String interapolation
    
    println(f"$num%d and $num1%f and string value is $str1%s");
    
    println(raw"$num and $num1 and string value is $str1");
    
     println(s"$num and $num1 and string value is $str1");
    
  }
}