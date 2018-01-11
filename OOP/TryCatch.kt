package OOP

fun main(args:Array<String>){
    try {
        print("divide 100 by: ")
        var n:Int = readLine()!!.toInt()
        println("R: "+(100/n))
    }catch (e:Exception){
        println(e.message)
    }
}