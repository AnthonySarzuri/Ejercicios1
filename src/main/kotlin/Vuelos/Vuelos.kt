package Vuelos

import java.time.LocalDate
import java.time.LocalDateTime

class Vuelos (
    fecha: LocalDate,
    destino: String,
    vuelo: String,
    asiento: Int
        ){

    //atributos opcionales
    var cantEquipaje: Int=0
    var tipoMerienda: String=""
    var aerolinea: String=""
    var esValido= true

    var vueloValido: String = vuelo
        set(value) {
            val valido = LocalDate.now()
            if (valido >= LocalDate.now() ){
                field=value
            }else{
                esValido=false
                0
            }
        }

    var asientosValidos: Int =asiento
        set(value) {
            val cant = 0
            if (cant > 50 ){
                field=value
            }else{
                esValido=false
                0
            }
        }

    var aerolineaValido: Int =asiento
        set(value) {
            val aero1="BOA"
            val aero2="AMAZONAS"    

        }

}