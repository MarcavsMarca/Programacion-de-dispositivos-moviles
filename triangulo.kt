fun tipoDeTriangulo(lado1: Int, lado2: Int, lado3: Int) {
    
 if(lado1 == lado2 && lado2 == lado3){
     println("Es un triangulo equilatero")
 } else if(
 		(lado1==lado2 && lado3!=lado1)	||
 		(lado2==lado3 && lado1!=lado2) ||
        (lado3==lado1 && lado2!=lado3) ){
        println("Es un triangulo isoceles")
	} else {
    	println("Es un triangulo escaleno")
	}
}

fun main() {
    tipoDeTriangulo(5, 5, 5) // Triángulo equilátero
    tipoDeTriangulo(5, 5, 6) // Triángulo isósceles
    tipoDeTriangulo(3, 4, 5) // Triángulo escaleno
}