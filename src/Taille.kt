class Taille {
    var Prenom: String = ""
    var taille: Int = 0
    var poids: Int = 0
    var Personne = mutableListOf<Any>(Prenom,taille,poids)

    constructor(Personne: MutableList<Any>) {
        this.Personne = Personne
    }
}


