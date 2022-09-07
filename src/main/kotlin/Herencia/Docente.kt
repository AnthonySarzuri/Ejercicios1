package Herencia
//si vas a heredar de una clase padre usas : acompañado de la clase padre
class Docente(
    nombre: String,
    apellido: String,
    salario: Int,
    profesion:String,
    area:String,
    asignatura:List<String>
): Empleado(nombre,apellido,salario,profesion) {

    var areaFinal = area
    var asignaturas=asignatura

    //llamada sobreescritura de metodos del padre
    override fun mostrarInfo() {
        //ejecuta el contenido de ese metodo tal cual esta en el padre
        super.mostrarInfo()
        //complementar comportamiento
        println("""
            Pertenece al area: $areaFinal
            dicta: ${asignaturas.joinToString()}
        """.trimIndent())
    }

}