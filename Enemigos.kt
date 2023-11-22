package com.example.android_studio_practicas

import android.telephony.CellSignalStrength

open class Enemy (val name: String, val strenght: Int, var state: String) {
    //constructor(name: String, strength: Int, state: String, s: String) : this(name, strength)

    protected  var direction:String="LEFT"// la direccion hacia donde camina un enemigo
    protected fun changeDirection(){//cambiar el sentido de movimiento al contrario
        direction= if (direction=="RIGHT")"LEFT" else "RIGHT"
        println("$name va en direccion $direction")
    }
    protected fun die(){// in dicamos al jugador  que nuestro enemigo ha muerto
        println("$name ha muerto")
    }
    open fun collision (collider:String){//decidir que haccion ejecutar dependiendo del objeto con que se colisiona
        when (collider){
            "weapon"-> die()
            "Enemy"-> changeDirection()
        }
    }
}