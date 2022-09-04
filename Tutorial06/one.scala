import scala.io.StdIn.readInt
import scala.io.StdIn.readLine
import scala.util.control._ 
object q1 extends App{
    val alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val encrypt=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)+key)%a.size)
    val decrypt=(c:Char,key:Int,a:String)=>{
      if(a.indexOf(c.toUpper)-key>=0){
         a((a.indexOf(c.toUpper)-key)%a.size)
      }else{
        a((a.indexOf(c.toUpper)-key+a.size))
      }
    }

    val cipher=(f:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(f(_,key,a))

    printf("***OPTIONS***\n1=Encrypt\n2=Decrypt\n\n")
    var op=0
    while(op!=3){
       printf("Enter the option:") 
       op=readInt()
       printf("Enter the text:")
       var text=readLine()
       printf("Enter the key value:")
       var key=readInt()
       if(op==1){
            var ct=cipher(encrypt,text,key,alphabet)
            println(ct)
       }else if(op==2){
            var pt=cipher(decrypt,text,key,alphabet)
            println(pt)
       }else{
           printf("Wrong option\n")
       }
    }
}
