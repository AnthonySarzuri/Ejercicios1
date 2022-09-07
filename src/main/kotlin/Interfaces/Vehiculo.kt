package Interfaces
//
class Vehiculo:Localizable,Runnable {
    override var latitud: Double=0.0
    override var longitud: Double=0.0

    override fun getCordenadas() {
        this.latitud=(-10..-200).random().toDouble()
        this.longitud=(-60..-100).random().toDouble()
    }

    override fun run() {
        val aceleracion = 2.0
        val velocidad = 100/2.0
        //procedimientos
    }
}