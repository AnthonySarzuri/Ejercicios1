package Abstracto

import java.math.BigDecimal
import java.time.LocalDate

class Estudiante(
    nombre:String,
    apellido:String,
    fecha:LocalDate,
    genero:Char,

):Persona() {
    //Cuando tienen valores que no saben c
    override var nombre: String=""
    override var apellido: String=""
    override var fechanacimiento: LocalDate= LocalDate.now()
    override var genero: Char='F'
    override var univesidad: String="UNIVALLE"

    var matricula:BigDecimal= BigDecimal(100)

    init {
        this.nombre=nombre
        this.apellido=apellido
        this.fechanacimiento=fecha
        this.genero=genero

        this.edad=calcularEdad()
    }

    override fun mostrarDatos(): String {
        return """
            Sus datos son: $nombre $apellido
            Su fecha de nacimiento: $fechanacimiento
            Genero: $genero
            Universidad: $univesidad
            
        """.trimIndent()
    }
}