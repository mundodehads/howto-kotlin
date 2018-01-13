fun main(args:Array<String>){
    //to get the size is arraylist.size
    var arraylist=ArrayList<String>()
    arraylist.add("henrique")
    arraylist.add("alves")
    arraylist.add("da")
    arraylist.add("silva")
    println("first name:"+arraylist.get(0))
    arraylist.set(0, "ilson")
    for(item in arraylist){
        println(item)
    }
    //Search for some item
    if(arraylist.contains("ilson")){
        println("name is found")
    }else {
        println("name is found")
    }
}