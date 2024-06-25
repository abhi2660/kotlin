import kotlin.math.pow

fun main(){
//    println(add(4,5))
//    println(add(4.6,7.8))
//    to store function in a variable

    var fn=::add
    println(fn(3,4))

    fn=::power
    println(fn(2,3))
}

fun add(num1:Int,num2:Int):Int{
    return num1+num2
}

//overloading
//fun add(num1:Double,num2:Double):Double{
//    return num1+num2
//}

fun power(num1:Int,num2:Int):Int{
    return num1*num2}