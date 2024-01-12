fun main() {
    val number = readln().toInt()
    val nList = listOf(2, 3, 5, 6)
    for (n in nList) if (number % n == 0) println("Divided by $n")
}