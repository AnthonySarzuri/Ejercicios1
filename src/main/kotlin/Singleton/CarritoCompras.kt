package Singleton
/*Patron de disño de software
* objetivo solo puedas tener una unica instancia de una clase
* */

object CarritoCompras {
    var productos: List<Productos> = mutableListOf()

    fun mostrarProductos():String{
        val nombres=productos.map {
            it.nombre
        }
        return nombres.joinToString()
    }
}