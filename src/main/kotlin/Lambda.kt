fun main(){
    //lambda trata de resumir una funcion aun formato facil
    val suma ={x: Int, y: Int -> x+y}//es una funcion variable de tipo funcion
    //dos formas de imprimir
    //Invoke
    println(suma.invoke(5,6))
    //imprecion  mas resumida
    println(suma(4,6))
    //se pude definir una variable indicando la estructura de la funcion que quieres usar
    //firma de la funcion=lo hace unico a la funcion
    //en la forma de funcion lambda(tipo de datos de los parametros)-> int
    //firma de funcion lambda
    //it= es la variabale entera
    //it solo funciona con un parametro
    val agregarSieteVeces:(Int)->Int={
        it*7//variable =5 ---5*7
    }
    println("OTRO EJEMPLO DE FUNCIONES DE ORDEN SUPERIOR")
    println(OperacionesAritmeticas(2,4,::sumar))
    println(OperacionesAritmeticas(4,1,::restar))
    println(OperacionesAritmeticas(4,2,::multiplicar))
    println(OperacionesAritmeticas(10,2,::dividir))
    //OTRO EJEMPLO DE FUNCIONES DE ORDEN SUPERIOR
}
//AL DEFINIR COMOPARA,ETRO LA FUNCION PODRAS USAR EL FORMATO DE FIRMA
fun OperacionesAritmeticas(num1:Int,num2:Int,fn:(Int,Int) -> Int):Int {
    return fn(num1, num2)
}
fun sumar (x:Int, y: Int)=x+y
fun restar (x:Int, y: Int)=x-y
fun multiplicar (x:Int, y: Int)=x*y
fun dividir (x:Int, y: Int)=x/y