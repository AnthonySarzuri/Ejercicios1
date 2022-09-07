package Herencia
//Kotlin diferentes caminos
//Kotlin por defecto no se permite la herencia
//La herencia siempre que se encuentren en una situacion donde todos elementos  pertenescan a la misma naturaleza
//Habilitar la clase metodos o atributos que vayas usar palabra reservada open
open class Empleado(
    open val nombre: String,
    open val apellido: String,
    open val salario: Int,
    open val profesion:String
) {
    val seguro:Int=0
    open fun calcularSeguro(): Int = (100..500).random()

    open fun mostrarInfo(){
        println("""
            Empleado: $nombre $apellido
            Gana: $salario
            Profesion: $profesion
        """.trimIndent())
    }

}