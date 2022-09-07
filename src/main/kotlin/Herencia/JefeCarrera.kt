package Herencia

class JefeCarrera (
    nombre: String,
    apellido: String,
    salario: Int,
    profesion:String,
    facultad:String,
    especialidad:String
): Empleado(nombre,apellido,salario,profesion){
    val segurojefe:Int=0
    var facultadDes=facultad
    var especialidadGrado=especialidad

    override fun calcularSeguro(): Int {
        return (salario*0.25).toInt()
    }

    override fun mostrarInfo() {
        super.mostrarInfo()
        calcularSeguro()
        println("""
            Pertenece al area: $facultadDes
            dicta: $especialidadGrado
            Seguro: ${calcularSeguro()}
        """.trimIndent())

    }
}