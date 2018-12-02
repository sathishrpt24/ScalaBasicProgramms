

object StringInterapolation1 {
  
  def main(args:Array[String]){
    
    var a:Int = 10;
    var b:Float = 12.3f;
    var c: String = "Sathish Ponnusamy"
    
    
    println(s"a value is $a: b value is $b: c value is $c ");
    
     println(raw"a value is $a: b value is $b: c value is $c ");
     
     println(f"a value is $a%d: b value is $b%f: c value is $c%s ");
  }
}