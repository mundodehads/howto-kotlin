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
fun main(args:Array<String>){
    //Expecting get 45 as output
    //kotlin apply math rules by itself
    //output is 27
    //compiler: (n1+(n2*n3))-5 OR n2*n3+n1-5
    var n1:Int=2
    var n2:Int=3
    var n3:Int=10
    var sum:Int?
    sum=n1+n2*n3-5
    //add the $ and the name of the var/val works
    print("sum: $sum")
}