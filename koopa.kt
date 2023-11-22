package com.example.android_studio_practicas
//clase hija
class Koopa:
    Enemy("Koopa",2,"fight"){
        init {
            println("iniciando sub clase  de $name")
        }
    override fun collision(collider:String) {
        when (collider) {
            "Weapon" -> {
                state = "Shell"
                println("El estado es ahora $state")
            }

            "Enemy" -> changeDirection()
        }
    }
}