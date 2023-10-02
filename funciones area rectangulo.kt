// Función principal
fun main() {
    val userValidated = login("Juanito", "Navaja")// Utilizar la función de login y guardar el resultado 
    println("¿Usuario logeado? $userValidated")// Imprimir si el usuario está autenticado
println()
    // Correr área del rectángulo con valores por defecto
    println("Área con valores por defecto: ${rectangleArea()}")
    
    // Área del rectángulo con base y altura especificadas utilizando named arguments
    println("Área con valores determinados usando named arguments: ${rectangleArea(height = 10.0)}")
 }   
 // Correr área del rectángulo con valores por defecto 
fun login (user:String , password:String):Boolean {
	fun validated(input: String):Boolean{
        return (input.isEmpty())
    }
    val userValidated = validated(user) // Validar el usuario
    val passValidated = validated(password) // Validar la contraseña
	return userValidated && passValidated
}

// Función para calcular el área de un rectángulo
fun rectangleArea(base: Double = 20.0, height: Double = 30.0): Double {
    return base * height
}
