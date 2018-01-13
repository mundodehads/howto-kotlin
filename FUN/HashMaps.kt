fun main(args:Array<String>) {
    var map = HashMap<Int, String>()
    map.put(1, "henrique")
    map.put(2, "alves")
    map.put(3, "da")
    map.put(4, "silva")
    //you can use map[3] as well
    println(map.get(3))

    for (k in map.keys) {
        println(map.get(k))
    }
}