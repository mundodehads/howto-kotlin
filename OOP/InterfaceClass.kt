package OOP

interface op{
    //if you want to add a default just add {}
    fun sum(n1:Int, n2:Int)
    fun sub(n1:Int, n2:Int)
}

class UserOp:op{
    override fun sum(n1:Int, n2:Int){
        println("sum: "+ (n1+n2))
    }
    override fun sub(n1:Int, n2:Int){
        println("sub: "+ (n1-n2))
    }
}

fun main (args:Array<String>){
    var user = UserOp()
    user.sum(10,10);
}