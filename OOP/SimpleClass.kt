package OOP

//class can have parameters but it'll be val (need define type)
//if you want to not just only read, but write, you need to define it
//as a var variable:Type
class Car (var name:String, var year:Int, var value:Double) {
    //Constructor of the class
    init {
        println("New Car add: $name, $year, $value.")
    }
    //Methods
    fun getCarAnounce():String {
        return "Buy a "+this.name+" from "+this.year+" for just $"+this.value+"!"
    }

    /*
    Extras:
    you can define multiple constructors by initializate constructor()
    but you need to super the class like contructor():this(){}
    Ex:
    class car (){
        var name:String?=null
        constructor():this(){
            this.name = "example"
        }
    }
     */
}

fun main (args:Array<String>){
    //if parameters is var, you can get a variable just by car2.name
    val car1 = Car("gol", 2008, 10000.0)
    val car2 = Car("fusca", 1996, 2000.0)

    println(car1.getCarAnounce())
    println(car2.getCarAnounce())
}