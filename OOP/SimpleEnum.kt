package OOP

enum class Direction{
    NORTH, SOUTH, EAST, WEST
}

fun main (args:Array<String>){
    var playerDirection=Direction.SOUTH
    if(playerDirection==Direction.NORTH){
        println("To the north!")
    }else {
        println("We're lost...")
    }
}