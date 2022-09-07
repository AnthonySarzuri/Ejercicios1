package Modelo
//modelo de datos

//ajustar ciertos metodos macro para que se aproxime a lo que buscan  en este caso pensar en la logica del negocio
//kotlin -> en general toda clase hereda de una clase Macro de
class Docente(
    val nombre: String,
    val apellido: String,
    val materia:String
){
    //validacion a nivel de la logica de negocio
    //validacion por atributos
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Docente

        if (nombre != other.nombre) return false
        if (apellido != other.apellido) return false
        if (materia != other.materia) return false

        return true
    }

    override fun hashCode(): Int {
        var result = nombre.hashCode()
        result = 31 * result + apellido.hashCode()
        result = 31 * result + materia.hashCode()
        return result
    }
}