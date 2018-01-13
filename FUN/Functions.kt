//the location of the function doesn't matter
//if you dont define the type of fun, it will be void
fun sum(n1:Double, n2:Double):Double{
    return n1+n2
}
//declare Unity is the same as declare nothing
//fun display(n:Int):Unity{
fun display(n:Int){
    println("n: $n")
}

fun main(args:Array<String>){
    var response=sum(10.0,10.0)
    println("R: $response")
    display(10)
}

/*
Function overload:
    you can create a function with the same name but
    another parameters.
    Ex:
        fun sum(x:Int, y:Int)
        fun sum(x:Int, y:Int, z:Int)
Function polymorphism:
    you can create a function with the same name and
    the same numbers of parameters but
    with diferents types.
    Ex:
        fun sum(x:Int, y:Int)
        fun sum(x:Double, y:Double)
 */