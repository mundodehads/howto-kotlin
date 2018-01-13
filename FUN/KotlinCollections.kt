fun main(args:Array<String>){
    var map=hashMapOf(1 to "henrique",
            2 to "da")
    map.put(3, "da")
    println(map.get(1))
    println(map[2])

    var ar=arrayOf(10,20,30,40)
    println(ar[0])

    //linked list, cannot change the value
    var list=listOf(40,30,20,10)
    println(list[0])

    //mutable list, can change the value
    var mlist=mutableListOf(50,60,70,80)
    println(mlist[0])
    mlist[0]=500
    println(mlist[0])
}