import scala.io.StdIn.readInt
def addeven(n:Int):Int= n match{
    case x if x<=2 =>0
    case x if (x-1)%2==0 => (n-1)+addeven(n-1)
    case x=>addeven(n-1)
}
object q5 extends App{
    print("Enter the number:")
    var a=readInt()
    println("Sum:"+addeven(a))
}