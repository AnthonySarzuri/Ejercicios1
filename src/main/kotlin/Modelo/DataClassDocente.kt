package Modelo

//Fomentan el principio de inmutabilidad
//Concepto basado en planear modelos de datos
//no nesecita implementar comportamientos
//solo representan el dominio de kos datos del contexto
//data clases no sirven para hacer herencia
//data class se las conoce como holders de informacion
//almacenadores de informacion
//sirve poara definir modelos de datos
data class DataClassDocente(
    val nombre: String,
    val apellido: String,
    val materia:String
)
