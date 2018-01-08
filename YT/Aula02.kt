//parametros = val
fun ope (x:Double, y:Double):Double {
    return x + 10.0 * y
}
/*
Priorite list:
1- ()
2- ++, -- (before var)
3- ^
4- *, /
5- +, -
6- =
7- ++, -- (after var)
 */
fun main (args:Array<String>) {
    var r: Double = ope(10.0, 2.0)
    println("r: $r")

    var x:Double = 10.0
    var k:Double = (10.0 + x++) * 2.0
    println("k: $k")
}
