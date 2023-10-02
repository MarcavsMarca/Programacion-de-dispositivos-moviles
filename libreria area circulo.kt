/*es una librería en este caso estamos importándola, por lo que
 * al importarla tenemos que ponerle para palabra import y 
 * poner el nombre de la librería, en este caso estamos llamando
 * a la de kotlin */
import kotlin.math.pow
const val PI =3.1416f
const val PHI=1.618f
fun main() 
{
  val radius=4f 
  val area = circleArea(radius)
  println("el area del círculo es : $area")
  println(getPi())
  printPHI()
}
/*fun se refiere a funcion*/
fun circleArea (radius:Float) : Float
{
    return PI*radius.pow(2)
}
fun getPi():Float
{
   	return  PI  
}
	fun printPHI()
{
    println("el número del áureo vale $PHI")
}