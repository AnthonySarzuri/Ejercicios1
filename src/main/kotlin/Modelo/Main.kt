package Modelo

fun main() {
    val docente1=Docente("Grover",
        "Soria",
        "Game Develoment")

    val docente2 =Docente("Grover",
        "Soria",
        "Game Develoment")
    //ambas variables son diferentes porque esta comparando su espacio en memoria
    //Compara estructura , espacio en memoria
    println("Son ambas variables iguales??: ${docente1==docente2}")

    val docente3=DataClassDocente("Shirley",
        "Salazar",
        "Progra")
    val docente4=DataClassDocente("Shirley",
        "Salazar",
        "Progra")

    //crea una copia exacta
    val docente5 =docente3.copy()

    println("Son ambas variables iguales??: ${docente3==docente5}")

    println(docente3.component1())
    println(docente3.component2())

    val docente6=docente3.copy(materia = "Base de Datos")
    println("${docente6.nombre} dicta: ${docente6.materia}")

}