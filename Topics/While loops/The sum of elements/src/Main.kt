fun main() {
    var number: Int
    var numberSum = 0
    do {
        number = readln().toInt()
        numberSum += number
    } while (number != 0)
    println(numberSum)
}