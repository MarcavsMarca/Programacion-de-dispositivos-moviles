package com.example.android_studio_practicas.ui.theme

class Vehicle {
    init {
        println("Vehiculo creado")
    }
    companion object Factory{
        fun create(): Vehicle= Vehicle()
    }
}