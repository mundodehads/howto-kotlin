package OOP

//Extension is to add methods and variables to a already initialized class
//can use it to implement swap, order, equal...
fun ArrayList<String>.swap(i1:Int, i2:Int){
    var temp = this.get(i1)
    this.set(i1, this.get(i2))
    this.set(i2, temp)
}

fun main (args:Array<String>){
    var AL = ArrayList<String>()
    AL.add("Henrique")
    AL.add("Alves da")
    AL.add("Silva")
    println("before: "+AL)
    AL.swap(1,2)
    println("after: "+AL)
}