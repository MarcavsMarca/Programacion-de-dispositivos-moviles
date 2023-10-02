//en la funcion se le tiene que agregar el balon de la base y de la altura para calular el area
fun main() {
    val base=5f // Asigna un valor a la variable base
    val altura=10f // Asigna un valor a la variable altura
    val area=base*altura
    println("El área es $area")
}


fun imprimir
(
    valor:String="Este es el primer valor por defecto",
    valor2:String="Este es el segundo valor por defecto")
    {
    println (valor)
    println (valor2)
    }
    
fun promedio (
    		primera:Float=8f,
            segunda:Float=8f,
            tercera:Float
			):
	Float{
    return (primera + segunda + tercera)/3f
}
    
val promedio = promedio(tercera =10f)