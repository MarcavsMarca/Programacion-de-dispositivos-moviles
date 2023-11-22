import com.example.android_studio_practicas.Goomba
import com.example.android_studio_practicas.Koopa
import com.example.android_studio_practicas.Person
import com.example.android_studio_practicas.Phone
import com.example.android_studio_practicas.ui.theme.Movie
import com.example.android_studio_practicas.ui.theme.National
import com.example.android_studio_practicas.ui.theme.Vehiculo
import com.example.android_studio_practicas.*

fun main() {
        //Phone
        val myPhone = Phone()
        myPhone.getTurn()
        myPhone.TurnOn()
        myPhone.getTurn()

        // Vehiculo
        val miVehiculo = Vehiculo("Ford", "Focus", "verde", "REM-4123")
        println("El coche está prendido? ${miVehiculo.encendido}")
        miVehiculo.recargar(20.07f)
        println("El tanque tiene ${miVehiculo.gasolina}")

        val golNegro = Vehiculo("volkswagen", "Gol")
        val pointer = Vehiculo(
                color = "azul",
                marca = "volkwagen",
                modelo = "Pointer"
        )
        // Person
        val person = Person(
                "Daniel",
                "Bedu",
                "Masculino",
                1.78f
        )
        // com.example.android_studio_practicas.Mario
        val mario = Mario()
        mario.collision("Pipe")

        for (i in 1..5) {
                mario.collision("Goomba")
                println("Te quedan ${mario.getLives()}")
        }

        // Enemigos
        val enemy = Goomba("Un enemigo", 1,"fight")
        val koopa = Koopa()
        koopa.collision("Weapon")

        // Viaje
        val viajeMonterrey = National("Monterrey")
        viajeMonterrey.quotePrice(2)
        viajeMonterrey.reserve(2)

        //val viajeBajaMonterrey = NationallowSeason("Monterrey")
        //viajeBajaMonterrey.reserve(4)

        // Movie
        val scaryMovie = Movie("Scary movie", "Comedia", 88.27)
        println("${scaryMovie.component2()}")

        val (nameDeS, genderS, duration) = scaryMovie
        println("Duración: $duration Name: $nameDeS Género: $genderS")

        val scaryMovie2 = scaryMovie.copy(name = "Scary movie 2", duration = 83.0)
        println("""
        |Scary movie: $scaryMovie
        |Scary movie 2: $scaryMovie2
    """.trimMargin())
}