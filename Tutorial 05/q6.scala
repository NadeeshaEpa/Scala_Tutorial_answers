object q6 extends App{
    def fibonacci(n:Int):Int={
        if(n==0){
            return 0
        }else if(n==1){
            return 1
        }else{
            return fibonacci(n-1)+fibonacci(n-2)
        }
    }
    def printfib(n:Int):Unit={
        if(n>0){ 
           printfib(n-1)
           println(fibonacci(n-1))
        }
        
    }

    printfib(5)
}