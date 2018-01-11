package OOP

fun main (args:Array<String>){
    var t1 = UserThread("TH1")
    t1.start()
    var t2 = UserThread("TH2")
    t2.start()
    t2.join()
    println(" thread is running")
}

class UserThread:Thread{
    var ThreadName:String = ""

    constructor(ThreadName:String):super(){
        this.ThreadName = ThreadName
        println(this.ThreadName+" is started")
    }

    override fun run(){
        //write thread
        for(i in 0..10){
            println(this.ThreadName+": "+i)
            try {
                Thread.sleep(1000)
            }catch (e:Exception){
                println(e.message)
            }
        }
    }
}