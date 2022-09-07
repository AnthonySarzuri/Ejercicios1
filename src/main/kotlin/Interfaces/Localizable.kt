package Interfaces
//abstracto
//coleccion metodosabstractos
//compartido por varias clases
//Reglas del juego
//Contrato...
//interfaces: permiten atributos y comportamientos abstractos
//interfaces: ahora permitenque puedas definir la logica sw un metodo dentro la interfaz
//recomendable en lo abstracto
interface Localizable {
    var latitud:Double //abstracto
    var longitud:Double //abstracto

    fun getCordenadas()
    fun mostrarInformacion():String{
        return """
            Latitud: $latitud
            longitus: $longitud
        """.trimIndent()
    }
}