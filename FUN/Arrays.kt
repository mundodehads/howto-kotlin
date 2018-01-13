fun main (args:Array<String>){
    //in array you need to add the size
    var arrayInt=Array<Int>(5){0}
    println("Array[3]: "+arrayInt[3])
    arrayInt[3] = 10
    println("Array[3]: "+arrayInt[3])
    //almost like a foreach
    println("Array by element:")
    for(element in arrayInt){
        println(element)
    }
    println("Array by index")
    for(index in 0..4){
        println(arrayInt[index])
    }
}