//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*fun main() {
   val gros = Personne(99.0,1.63,"Billy")
   println(gros.IMC())
   println(gros.Classement())

} 

fun main(){
   val loca = Location(600,2,"C")
println(loca.montantTotal())
}


fun main(){
   val argent = Account(50.0)
   println(argent.Getbalance())
   println(argent.depose(60.9))
   println(argent.retire(0.9))
} */

//fun main(){
//    println("Entre votre nom")
//    var nom = readln()
//    println("Entre votre prenom")
//    var prenom = readln()
//    println("Entre votre matricule")
//    var matricule = readln()
//    println("Entre votre annee")
//    var annee = readln().toInt()
//    println("Entre votre salaire")
//    var salaire: Double = readln().toDouble()
//
//    val empoye = Employe(nom,prenom,matricule,annee,salaire)
//println(empoye.ancien())
//println(empoye.augmentation())
//println(empoye.AfficherEmployer())
//}


fun main(){
    var lesPersonnes = mutableListOf<Personne>()
    lesPersonnes.add(Personne("toto",1.6,60))
    lesPersonnes.add(Personne("titi",1.8,76))
    println(lesPersonnes)
    var cumulTaille = 0.0
    for ( unePersonne in lesPersonnes){
        println("${unePersonne.Nom} a un imc de ${unePersonne.IMC()}")
        cumulTaille += unePersonne.taille
        println(lesPersonnes.indexOf(unePersonne))
    }
    println("La taille moyenne est de ${cumulTaille/lesPersonnes.size}")
for (grandpersonne in lesPersonnes){
    if(grandpersonne.taille > lesPersonnes[+1].taille){
        println("Le plus grand ${grandpersonne.Nom} ${grandpersonne.taille}")

    }
}


}
