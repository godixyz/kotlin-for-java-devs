package w2

// Uncomment and change the 'sum' function so that it was declared as an extension to List<Int>.

/** fun sum(list: List<Int>): Int {
    var result = 0
    for (i in list) {
        result += i
    }
    return result
} */

fun List<Int>.sumExt(): Int {
    var result = 0
    for (i in this) {
        result += i
    }
    return result
}

fun main() {
    // without the extension function
   // val sum = sum(listOf(1,2,3))

    // using the sum extension function
    val sum = listOf(1,2,3).sumExt()
    println(sum)
}