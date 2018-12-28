package FileHandling

import java.io._
import scala.io.Source;

class NewFileWrite {
  
  def writefile(){
  
  var fileobject = new File("ScalaFile.txt");
  
  var po = new PrintWriter(fileobject);
  
  po.write("Hello How are you");
  
  po.close();
  
  }
  
  def readFile(){
    
    var path:String = "C:\\Users\\acer\\git\\ScalaBasicProgramms\\ScalaBasic\\ScalaFile.txt"; 
    
    
    var fileSource = Source.fromFile(path);
    
   // fileSource.s
   //  var line_Count = fileSource.getLines();
    // println(line_Count);
    while(fileSource.hasNext){
      
    print(fileSource.next); 
    
    
      
    }
    fileSource.close()
  }
  
}

object readwrite{
  
  def main(args:Array[String]){
    
    var rw = new NewFileWrite();
    
    rw.writefile();
    rw.readFile();
  }
}