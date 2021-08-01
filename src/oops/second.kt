package oops

class second {

    constructor(num:Int,name:String, mark:Float)
    {
        println(" enter the number $num")
        println(" enter the name $name")
        print(" enter the mark $mark")
    }

    constructor(college:String , pass:String)
    {
        println(college)
        println (pass)
    }

}

fun main() {
    var s= second(101,"nikhi",95.5f);
    var s2=second("bjs","nikhil")
}