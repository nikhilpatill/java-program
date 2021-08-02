package kotline

import kotlin.jvm.JvmStatic

object merg {
    fun dis(a: IntArray, low: Int, mid: Int, high: Int) {
        var i = low
        var j = mid + 1
        var k = low
        val b = IntArray(100)
        while (i <= mid && j <= high) {     //   <=  &&  <=
            if (a[i] < a[j]) {         //     <
                b[k] = a[i]
                i++
                k++
            } else {
                b[k] = a[j]
                j++
                k++
            }
        }
        while (i <= mid) // i<=mid
        {
            b[k] = a[i]
            i++
            k++
        }
        while (j <= high) //                  j<=mid
        {
            b[k] = a[j]
            j++
            k++
        }
        i = low
        while (i <= high) {
            a[i] = b[i]
            i++
        }
    }

    fun m_sort(a: IntArray, low: Int, high: Int) {
        val mid: Int
        if (low < high) {                          //         low<high
            mid = (low + high) / 2
            m_sort(a, low, mid)
            m_sort(a, mid + 1, high)
            dis(a, low, mid, high)
        }
    }

    fun print(a: IntArray, n: Int) {
        for(i in 0..n){
            print(a[i])

        }
        print(" soting ")
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val a = intArrayOf(3, 2, 1)
        val n = a.size
        print(a, n)
        m_sort(a, 0, n - 1)
        print(a, n)
    }
}