package Abstracto

import java.time.LocalDate
//abstract class
//solo refiere el concepto para hacerlo
//nose puede usar directamente
//no deberia tener constructor primario

abstract class Persona() {
    //loabstracto son politicas a cumplir obligatoriamente por los descendientes
    abstract var nombre:String
    abstract var apellido:String
    abstract var fechanacimiento:LocalDate
    abstract var genero:Char
    abstract var univesidad: String
    open var edad:Int=0

    //abstracto referencia a comportamiento y atributos
   abstract fun mostrarDatos():String//Politica a sus descendientes

   open fun calcularEdad():Int=LocalDate.now().year-fechanacimiento.year

}
/*="""
        Sus datos son: $nombre $apellido
        pertener a $univesidad
    """.trimIndent()*/