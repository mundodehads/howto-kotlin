package OOP

//You cant acess abstract data
//only if it was extend
abstract class CreditCard(){
    fun ID():String{
        return "123.456.789-0"
    }
}

class UserInfo():CreditCard(){
    fun getInfo():String{
        return ID()
    }
}

fun main (args:Array<String>){
    var user = UserInfo()
    println(user.getInfo())
}