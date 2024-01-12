fun findYears(depo: Double): Int{
    var deposit = depo
    val interestRate = 1.071
    val max = 700000
    val min = 50000
    var years = 0
    while (deposit > min && deposit < max) {
        deposit *= interestRate
        years++
    }
    return years
}
