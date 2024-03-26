import java.time.LocalDate
class Employe {
var Nom : String = ""
var Prenom : String = ""
var Matricule : String = ""
var anneeEmbauche : Int = 0
var Salaire: Double = 0.0

    constructor(Nom: String, Prenom: String, Matricule: String, anneeEmbauche: Int, Salaire: Double) {
        this.Nom = Nom
        this.Prenom = Prenom
        this.Matricule = Matricule
        this.anneeEmbauche = anneeEmbauche
        this.Salaire = Salaire
    }
fun ancien(): Int {
    val anneeactuelle = LocalDate.now().year
    val res: Int = anneeactuelle - this.anneeEmbauche
    return res
}
fun augmentation():Double {
    var res: Double = this.Salaire
    if(ancien()<5){
  res *=1.02 }
    else if (ancien()<10) {
  res *=  1.05
    }
    else{
        res *= 1.10
    }
    return res
}
fun AfficherEmployer(): String {
    var prenom: String = this.Prenom.capitalize() 
    val nom: String = this.Nom.uppercase()
    val res = nom +" " +  prenom +" "+ ancien() + this.Matricule  + augmentation()


    return res
}
}


