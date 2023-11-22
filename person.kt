package com.example.android_studio_practicas

class Person (val name: String, val apellidos: String, val sexo: String, val altura: Float) {
    init {
        println("""
            nombre:
            apellidos:
            sexo:
            altura:
            """.trimIndent())
    }
}