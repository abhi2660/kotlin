fun main(){

    val animal="dog"

//    if (animal=="horse"){
//        println("animal is horse")
//
//    }
//    else if (animal=="dog"){
//        println("animal is dog")
//    }
//    else if (animal=="cat"){
//        println("animal is cat")
//    }
//    else{
//        println("animal not found")
//    }

//    when(animal){
//
//        "cat" -> println("animal is cat")
//        "horse" -> println("animal is horse")
//        "dog" -> println("animal is dog")
//        else -> println("animal not found")
//    }

//    val result =when(animal){
//
//        "cat" -> "animal is cat"
//        "horse" -> "animal is horse"
//        "dog" ->"animal is dog"
//        else -> "animal not found"
//    }
//    println(result)


var num = 10
    val result =when(num){

       11  -> 11
        12-> 12
       in 13.. 19->"between 13 to 19"
        else -> "number not found"
    }
    println(result)


}