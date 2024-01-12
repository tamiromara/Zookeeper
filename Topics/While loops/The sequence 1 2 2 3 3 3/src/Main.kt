fun main() {
    val inputNumber = readln().toInt()
    var counter = 1
    var toPrint = 1
    while (inputNumber >= counter) {
        repeat(counter) {
            if (inputNumber >= toPrint) {
                print("$counter ")
                toPrint++
            }
        }
        counter++
    }
}
