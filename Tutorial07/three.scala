 class Account(id:String,n:Int,b:Double){
    val nic:String=id
    val acno=n
    var balance=b
    
    override def toString = "[ " + nic + " : " + acno + " : " + balance +" ]"

    def withdraw(a:Double)=this.balance-a
   
    def deposit(a:Double)=this.balance+a
    
    def transfer(a:Account,b:Double)={
        this.balance=this.withdraw(b)
        a.balance=a.deposit(b)
       
    }
}
object q3 extends App{
  //var bank:List[Account]=List()
  val acc1=new Account("001",123,25000)
  val acc2=new Account("002",234,50000)
  println("Before the transaction:")
  println("Account "+acc1.acno+" balance:"+acc1.balance)
  println("Account "+acc2.acno+" balance:"+acc2.balance+"\n")
  acc1.transfer(acc2,2000)
  println("After the transaction:")
  println("Account "+acc1.acno+" balance:"+acc1.balance)
  println("Account "+acc2.acno+" balance:"+acc2.balance)
}

