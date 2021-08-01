import kotlin.jvm.JvmStatic

class tom {
    fun dis() {
        val num = 5
        var name: String
        var i: Int
        i = 0
        while (i < num) {
            println(i)
            i++
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val s = tom()
            s.dis()
        }
    }
}