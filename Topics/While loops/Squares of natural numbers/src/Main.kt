fun main() {
    val topValue = readln().toInt()
    var rotator = 1
    var n = 1
    while (rotator <= topValue) {
        println(rotator)
        n++
        rotator = n * n
    }
}