import scala.io.StdIn.readDouble
object q1 extends App{
    printf("Enter the deposit amount:");
    var amount=readDouble();
    if(amount<=20000){
        printf("Interest:%.3f",amount*2/100);
    }else if(amount<=200000){
        printf("Interest:%.3f",amount*3.5/100);
    }else if(amount<=2000000){
        printf("Interest:%.3f",amount*4/100);
    }else{
       printf("Interest:%.3f",amount*6.5/100);
    }
}
