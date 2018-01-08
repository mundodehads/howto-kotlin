package OOP

class UserAdmin<T> (credit:T){
    init {
        println(credit)
    }
}

fun <T> display (output:T){
    println(output)
}

fun main (args:Array<String>){
    var admin1 = UserAdmin<String>("123.456.789-0")
    var admin2 = UserAdmin<Int>(1234567890)

    display<String>("Oioi")
    display<Int>(1010)
}