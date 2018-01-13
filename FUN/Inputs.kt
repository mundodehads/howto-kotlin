fun main(args:Array<String>){
    print("Enter name:")
    //The readLine fun works like a input reader to define the var
    var name=readLine()
    print("Enter age:")
    //!! means expecting
    var age:Int=readLine()!!.toInt()
    print("Enter dep:")
    var dep:String?
    dep=readLine()
    print("Enter pi:")
    var pi:Double=readLine()!!.toDouble()
    println("**** output ****")
    println("name:"+name)
    println("age:"+age)
    println("dep:"+dep)
    println("pi:"+pi)
    /*
    Note that if compile it you'll notice how it compile
    also can be seen if add a breakpoint on the first line
     */
}