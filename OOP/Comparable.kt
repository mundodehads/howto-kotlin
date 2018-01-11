package OOP

import java.util.*

class Person (var name:String, var age:Int):Comparable<Person>{
    override fun compareTo(other:Person):Int{
        //positive = greater
        return this.age - other.age
    }
}

fun main (args:Array<String>){
    var al = ArrayList<Person>()
    al.add(Person("Claudio", 29))
    al.add(Person("Henrique", 21))
    al.add(Person("Rodrigo", 27))
    println("before sort:")
    for(person in al){
        println(person.name+"/"+person.age)
    }
    Collections.sort(al)
    println("after sort:")
    for(person in al){
        println(person.name+"/"+person.age)
    }
}