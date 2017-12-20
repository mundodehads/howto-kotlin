fun main(args:Array<String>){
    var setX=setOf(10,20,30)
    for(element in setX){
        println(element)
    }
    var setY=mutableSetOf(10,20,30)
    setY.add(40)
    for(element in setY){
        println(element)
    }
}