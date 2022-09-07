package Enums

import java.time.LocalDate
import java.time.Month

fun main() {
    val estEnemy=EnemyStates.ATTACK

    println(estEnemy)

    val genero=Genero.MASCULINO
    val estudiante=Estudiant("Brajin",
    "Delgado",
    Genero.MASCULINO.toString()
    )
    println(estudiante)
    val rojo=Colores.RED.hexCode
    println(rojo)

    val error=500

    val errorType=if (error==500) ErrorType.INTERNAL_ERROR.message else ErrorType.SUCCESS
    println(errorType)

    val conection = ErrorType.ACCESS_DENIED.errorCode
    println(conection)
    println(ErrorType.ACCESS_DENIED.showServer())

    val fecha =LocalDate.of(
        2001,
        Month.OCTOBER,
        17)

}