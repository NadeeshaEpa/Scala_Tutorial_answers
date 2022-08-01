import scala.io.StdIn.readInt;
object q4 extends App{
    print("Enter a Integer:");
    var a=readInt();
    print(find(a));
    def find(a:Int)=a match{
      case a if a<=0 =>"Negative/Zero"
      case a if a%2==0 =>"Even"
      case _=>"Odd"
    }
    
}