fun main(args:Array<String>){
    /*
    break will stop all of the loop
    continue will stop this loop
    jump:
    loop@for...
        for...
            if...break@lopp
     this jump will break all the loops
     */
    println("for")
    for(item in 1..3){
        println(item)
    }
    println("while")
    var x:Int=0
    while(x < 4){
        println(x)
        x++
    }
    println("do-while")
    var y:Int=5
    do {
        println(y)
        y++
    }while(y < 4)
}