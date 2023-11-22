import com.example.android_studio_practicas.Travel

open class National(override val city: String) : Travel() {

    override val country= "Mexico"

    //este mapa es un catalogo los diferentes precios por dia dependiendo de la ciudad
    protected val fees = mapOf(
        "Monterrey" to 400,
        "Guadalajara" to 350,
        "CDMX" to 360,
        "San Cristobal de las Casas" to 240,
        "San Miguel de Allende" to 320
    )

    override fun getPrice(numDays: Int): Int {
        val fee = fees[city] // obtenemos la tarifa según la ciudad
        return fee?.times(numDays) ?: 0 // regresamos 0 si no hay tarifa, si sí, hacemos el cálculo
    }

    override fun quotePrice(numDays: Int) {
        val price = getPrice(numDays)
        if (price==0){ //si no existe tarifa para esa ciudad, notificamos al usuario
            println("Lo sentimos, no hacemos viajes a esa ciudad")
        } else {
            println("Tu viaje a $city cuesta \$$price") //notificamos el precio al usuario
        }
    }
}