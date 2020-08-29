package com.example.myapplication

import android.provider.ContactsContract

fun main(){
//var saludo = "Hola que tal"
// val number = 10
// saludo = "Hola otro saludo"
// println("saludo $number")
// println(number)
// val number = Long.MAX_VALUE
// println(number + 1)
// val decimal = 2
// println(decimal.javaClass)
// val decimalFloat = 2.3f
// println(decimalFloat.javaClass)
// val y = true
// println(y)
// var palabra: String
// val char: Char = 'y'
// val num = 20
// val palabra: String = "Berni"
// val char = '2'
// var decimal = 30f
// println("$num $palabra $char $decimal")
// var number = 10
// val number2 = 33
// val number3 = 66
// var result1 = number + number2 + number3
// println("El resultado es:$number + $number2 + $number3 = $result1")
// number = 55
// println("El resultado es:" +
// "$number + $number2 + $number3 = ${number + number2 + number3}")
// var promedio = (number + number2 + number3)/3
// println("El promedio es:$promedio")
// fun getNombreCompleto(): String {
// return ""
// }
// fun getEdad(): Int {
// return 20
//    imprimirNombreCompleto("Bernardita", "Castro", 55)
//    val saludo = "Este es un mensaje"
//    printMessage(saludo)

//    imprimirVarios("hola", "que bueno", "espero que estés bien")
//    printMessageWithPrefix("Bernardita", prefix = "Estimada")
//    imprimirMessageWithPrefix("azul", "verde", "amarillo", prefix = "Color: ")


// Funciones de Extensión
// val nombre = "Bernardita"
// val nombre2 = "Diego"
// nombre2.saludo()
   // nombre2.imprime()
    //"algo".imprime()

    //Instanciar un objeto
//val customer = Customer()
//
 //   val mContact = Contact(1, "bcastrothompson@gmail.com")
  //  println(mContact)
  //  println(mContact.id)
 //   println(mContact.email)
//val perrito = Dog()
//    perrito.makeNoise()

    val YorkShire
    val yorkShire: Dog = YorkShire
    yorkShire.makeNoise()

} //Acá termina mi Main

//declarar una funcion y asignarle parametros

fun imprimirNombreCompleto (nombre:String, apellido:String, edad: Int){
    val edad = edad + 1
    println("Mi nombre es: $nombre $apellido $edad")
}
fun printMessage(mensaje:String){
    println(mensaje)
}
fun printMessageWithPrefix(name:String, prefix:String = "Estudiante :"){
    println("$prefix : $name")
}
fun sum(x: Int, y: Int):Int {
    return x + y
}
fun multiplicacion(num: Int, num2: Int):Int{
    return num * num2
}
fun imprimirVarios(vararg mensaje: String) {
    for (elemento in mensaje) println(elemento)
}
fun imprimirMessageWithPrefix(vararg mensaje:String, prefix:String) {
    for (elemento in mensaje) println(prefix + elemento)
}
fun String.saludo(){
    println("$this Que Tal?")
}
fun String.imprime(){
    println(this)
}
fun String.despedida(){
    println("Chao")
}

//class FirstClass
//class Personal(mText:String)

//class Customer // una clase
//class Contact(val id: Int, var email: String) //una clase con parametros

open class Dog {
    open fun makeNoise(){
        println("Wow Wow")
    }
    class YorkShire : Dog(){
        override fun makeNoise() {
            super.makeNoise()
            print("wif wif")
        }
    }
}