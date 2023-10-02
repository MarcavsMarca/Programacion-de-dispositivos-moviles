//para crear un parametro se utiliza Any que asigna el tipo de dato que se esta daondo
//ya sea string entero , doble, entero o que se aun dato que no pueda ser soportado
fun tipodeDato(dato:Any){
    when (dato){
   		is String -> println("Es una String")
   		is Int -> println("Es un Entero")
   		is Double -> println("Es un Doble")
        else ->  println("Tipo de dato no soportado")
    }
}
//seimrpe es importante introducir la funcion menu,  en este caso la funcion de el tipo de dato
//que se quiere determinar es mediante los datos provenientes de la funcionprincipal la cual
//tiene un aprametro asgnado
//esto sacado de interenet un parametro es Elemento o dato importante desde el que se examina un tema, cuestión o asunto.

//MATEMÁTICAS:Variable que aparece en una ecuación cuyo valor se fija a voluntad.
//esto adaptado a infortmatica se refiere a que se asigna a volutad el limite o lo que se quiere hacer
fun main() {
    val texto = "Hola, mundo"
    val numero = 42
    val decimal = 3.14

    tipodeDato(texto)   // Imprimirá "Es una String"
    tipodeDato(numero)  // Imprimirá "Es un Entero"
    tipodeDato(decimal) // Imprimirá "Es un Doble"
}