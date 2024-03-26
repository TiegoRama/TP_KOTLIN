class Location {
    var nom:String = ""
    var km: Int = 0
    var jour: Int = 0
    var categorie: String = ""

    constructor(km: Int, jour: Int, categorie: String, nom:String) {
        this.nom=nom
        this.km = km
        this.jour = jour
        this.categorie = categorie
    }

    constructor()
fun montantJour(): Int {
    var categorit = when(this.categorie){
        "E" -> 30
        "C" -> 50
        "L" -> 75
        else -> 0
    }
    return categorit
}
fun montantlocation(): Int {

    val montantloca:Int = this.jour * montantJour()
    return montantloca
}
fun kmSupplementaire():Int {
    val kmb: Int = this.jour * 100
    val res: Int = this.km - kmb
return res
}
fun pxKmSupplementaire():Double {
    val res :Double = kmSupplementaire() * 0.5
    return res
}
fun montantTotal(): Double{
    var Total:Double = montantlocation()+pxKmSupplementaire()
    return Total
}
}