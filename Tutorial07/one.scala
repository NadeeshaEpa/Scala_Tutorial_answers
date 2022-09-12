class Rational(x:Int,y:Int){
    val numer=x
    val denom=y
    def neg=new Rational(-this.numer,this.denom)
}
object q2 extends App{
    val x = new Rational(1, 3)
    val result=x.neg;
    println("Negative value of "+x.numer+"/"+x.denom+" is equal to "+result.numer+"/"+result.denom)
}
