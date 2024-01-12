fun main() {
    val (hours, minutes, seconds) = readln().split(' ')
    val (days, months, year) = readln().split(' ')
    print("$hours:$minutes:$seconds ")
    println("$days/$months/$year")
}
