package oops

class first(num: Long, name:String, mark: Float, )
{
    init {
        println(num)
        print(name)
        print(mark)
    }

    constructor(num:Long) : this(101,name="nikhil",12.5f) {
        print(num)


    }

}

fun main() {
    var s=first(103,"nikhil",12.5f);
}