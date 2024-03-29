class Personne {
    var Nom: String = ""
    var poids: Int = 0
    var taille: Double = 0.0

    constructor(Nom:String , taille: Double,poids: Int) {
        this.Nom = Nom
        this.taille = taille
        this.poids = poids
    }

    constructor()

    fun IMC(): Double = this.poids/(this.taille * this.taille)
    fun Classement(): String {
        var res: String = ""
        if (this.IMC() < 18.5) {
            res = "Maigre"
        } else if (this.IMC() > 18.5 && this.IMC() < 24.9) {
            res = "Normal"

        } else if (this.IMC() > 25 && this.IMC() < 29.9) {
            res = "Surpoid"

        } else {
            res = "Obèse"
        }
return res }

}
