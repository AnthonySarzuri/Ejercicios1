package Herencia

fun main() {
    val docente=Docente(
        "Grover",
        "Soria",
        6000,
        "Informatico",
        "Sistemas",
        listOf("GameDevelopment","AR","Diseño Grafico")
    )
    //docente.mostrarInfo()

    val jefe=JefeCarrera(
        "Virginia",
        "Aspiazu",
        6000,
        "Informatico",
        "Sistemas",
        "licenciada"
    )
    jefe.mostrarInfo()
}