package oops

import kotlin.math.ln

class primary (num:Int, name:String, mark:Float,phone:Long )
{
    init {
        println(num)
        println(name)
        print(mark)
        print(phone)

    }
}

fun main() {
    var s=primary(101,"nikhil",12.5f,123456L);
}