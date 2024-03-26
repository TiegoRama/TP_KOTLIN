class Taille {
    var Nom: String = ""
    var Prenom: String = ""
    var taille: Int = 0
    var poids: Int = 0
    var Personne = arrayOf(Nom,Prenom,taille,poids)

    constructor(Personne: Array<out Any>) {
        this.Personne = Personne
    }
}