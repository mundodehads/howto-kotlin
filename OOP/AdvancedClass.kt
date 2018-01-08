package OOP

/*
You can also add public, protected and private
for variables in the class
 */
open class BasicOperations(){
    fun sum(n1:Int, n2:Int):Int{
        return n1+n2
    }
    open fun sub(n1:Int, n2:Int):Int{
        return n1-n2
    }
}

class Calculator:BasicOperations{
    //inicialize the extend constructor
    //can also instantiate as Calculator():BasicOperations(){}
    constructor():super(){}

    override fun sub(n1:Int, n2:Int):Int{
        println("teste: "+super.sub(n1,n2))
        return n2-n1
    }
}

fun main (args:Array<String>){
    var cal1 = Calculator()
    println("2+2="+cal1.sum(2,2))
    println("4-2="+cal1.sub(4,2))
    var cal2 = Calculator() as BasicOperations
    println("4-2="+cal2.sub(4,2))
}