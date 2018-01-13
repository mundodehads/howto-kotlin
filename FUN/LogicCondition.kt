fun main(args:Array<String>){
    //|| OR &&
    //!= == <= >= < > !
    println(10==10)
    println(10!=10)
    var n1=50
    var n2=100
    var max=if(n1>n2) n1 else n2
    println("max: $max")

    var age=21
    var isYoung = when(age){
        21->true
        else->false
    }
    println("is $age young?  $isYoung")
    //if is the same as always
    var n:Int=readLine()!!.toInt()
    if(n >= 7){
        println("You shall pass")
    }else if(n <= 4){
        println("You shall not pass")
    }else {
        println("May you shall pass")
    }
    //when is like switch
    when(n){
        1-> {
            println("value is 1")
        }
        2-> {
            println("value is 2")
        }
        //4 or 5
        3,4-> {
            println("value is 3 or 4")
        }
        //also could be !in
        in 6 .. 9-> {
            println("value between 6 - 9")
        }
        //else is the same as default
        else -> {
            print("May we see again!")
        }
    }
}