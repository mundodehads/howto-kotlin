fun main (args:Array<String>) {
    println("Hello world")
    var x:Int? = null
    println(x)
    x = 20
    println(x)

    var entrada:Double = readLine()!!.toDouble()
    var v1:String = "10"
    var sum:Double = entrada + v1.toDouble()
    println("sum: $sum")

}