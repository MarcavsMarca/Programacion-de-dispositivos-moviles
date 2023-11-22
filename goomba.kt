package com.example.android_studio_practicas

class Goomba(name: String, strenght: Int, state: String):
    Enemy("Goomba",1,"Fight") {
        init {
            println("iniciando sub clase  de $name")
    }
}