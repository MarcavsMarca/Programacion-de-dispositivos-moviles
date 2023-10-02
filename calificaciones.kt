import kotlin.math.round

fun main() {
 	val promedio = promedio() // Calcula el promedio una vez y almacénalo en una variable
       
    if (promedio < 5.9) {
            println("Reprobaste ${promedio()}")
        }
        else {
            println("Aprobaste ${promedio()}")
        }
}

fun promedio(calif1 : Float = 4f, calif2 : Float = 4f, calif3: Float = 7f): 
    Float {  
    return round((calif1 + calif2 + calif3)/3f) 
}