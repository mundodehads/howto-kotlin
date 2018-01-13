fun main(args:Array<String>){
    var x=10
    var y=11
    var z=++x+y // (++x)=(x=x+1)
    println("z:$z")

    println("before x:$x")
    var m=x+++y // (x+y)++
    println("m:$m")
    println("after x:$x")
}