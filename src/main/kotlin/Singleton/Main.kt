package Singleton

fun main() {
    val p1=Productos(
        "Parlantes",
        TiposProductos.SONIDO.toString(),
        799.99)

    val p2 =Productos(
        "Lavadoras",
        TiposProductos.ELECTRODOMESTICO.toString(),
        999.99)

    val p3 =Productos(
        "Huawei Nova 5T",
        TiposProductos.DISPOSITIVOS_MOVILES.name,
        899.99
    )

    val carritoCompra=CarritoCompras
    carritoCompra.productos = mutableListOf(p1,p2,p3)
    println(carritoCompra.mostrarProductos())

    val carritoCompra2=CarritoCompras
    println(carritoCompra2.mostrarProductos())

}