package OOP

class Outer {
    private val name:String?="Henrique"

    inner class Nested {
        fun Show(){
            println(name)
        }
    }
}

fun main (args:Array<String>){
    var nested = Outer().Nested()
    nested.Show()
}