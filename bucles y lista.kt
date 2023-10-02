fun lista() {
    val nombres = listOf(
        "Pedro Luis",
        "Juan Manuel",
        "Juan Luis",
        "Maria Inés",
        "Romeo",
        "Ernesto",
        "Juan Pedro",
        "Ariadna",
        "Mireya Maria",
        "Ana Sofia",
        "Jose Juan"
    )

    val nameCount = countName("Juan")
    println("El nombre 'Juan' aparece $nameCount veces en la lista.")
}

fun countName(name: String): Int {
    var count = 0
    val nombres = listOf(
        "Pedro Luis",
        "Juan Manuel",
        "Juan Luis",
        "Maria Inés",
        "Romeo",
        "Ernesto",
        "Juan Pedro",
        "Ariadna",
        "Mireya Maria",
        "Ana Sofia",
        "Jose Juan"
    )
    
    for (currentName in nombres) {
        if (currentName == name) {
            count++
        }
    }
    return count
}

fun findLink() {
    val nombres = listOf(
        "Kirby",
        "Ness",
        "Fox",
        "Luigi",
        "Mario",
        "Captain Falcon",
        "Samus",
        "Pikachu",
        "Link",
        "Link",
        "Yoshi"
    )
    
    for (nombre in nombres) {
        println(nombre)
        if (nombre == "Link") {
            println("¡Personaje encontrado!")
            break
        }
    }
}

fun countDown() {
    var x = 20

    while (x > 0) {
        println(x)
        x--
    }
}

fun doWhileExample() {
    var y = 0

    do {
        // Código a ejecutar
        println("Esto está dentro del ciclo do-while. Iteración $y")
        y++
    } while (y < 5) // Condición
}

fun main() {
    lista()
    findLink()
    countDown()
    doWhileExample()
}