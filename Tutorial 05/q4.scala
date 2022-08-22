object q4 extends App{
   def iseven(x:Int):Boolean=x match{
      case 0=>true
      case _=>isodd(x-1)
   }
   def isodd(x:Int):Boolean= !(iseven(x))
      
   println(iseven(21))
}