package Abstracto

import java.time.LocalDate

fun main() {
    //Polimorfismo
    //multiples formas
    //val est: Persona=Estudiante()
    //val est2: Estudiante= Estudiante()
    //val est3 =Persona() //representacion generaldel concepto que no nesecita instancias

    //clases abstractas
    val est =Estudiante(
        "Royer",
        "Ticona Chipana",
        LocalDate.of(2001,10, 17),
        'M'
    )

    println(est.mostrarDatos())

}