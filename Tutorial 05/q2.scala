object q3 extends App{
    def gcd(a:Int,b:Int):Int=b match{
       case 0 => a
       case x if x>a=>gcd(b,a)
       case _=>gcd(b,a%b) 
    }
  
    def prime(a:Int,n:Int=2):Boolean =n match{
     case x if(x==a)=>true
     case x if gcd(a,x)>1=>false
     case x=>prime(a,x+1)
    }
    def primeseq(n:Int):Any={
      if(n>1){  
        if(prime(n)){
          primeseq(n-1)
          println(n)
        }else{
          primeseq(n-1)
        }
      }
    }
    primeseq(10)
}