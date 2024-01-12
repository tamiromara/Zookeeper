fun main() {
    val year = readln().toInt()
    when (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
        true -> println("Leap")
        false -> println("Regular")
    }
}