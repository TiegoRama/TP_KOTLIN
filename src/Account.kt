class Account {
    var soldeini: Double = 0.0
    var balance: Double =0.0

    constructor(soldeini: Double) {
        this.soldeini = soldeini
    }
    constructor()

fun   Getbalance(): Double{
    val balanc = this.soldeini
    return balanc
}
fun depose(depos: Double):Double{
    val augmente: Double = Getbalance()+ depos
    this.balance = augmente
    return this.balance
}
    fun retire(retir: Double):Double{
        val moins: Double = this.balance - retir
        this.balance = moins
        return this.balance
    }
fun ajout_interet(interet: Double): Double{
    this.balance *= 0.4
    return this.balance

}
}