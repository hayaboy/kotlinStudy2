fun main(){

    //1)
//    if(true){
//        println("hi")
//    }
//
//    if(false){
//        println("hi#")
//    }
//
//
//    //2)
//    if(true){
//        println("hi")
//    }else{
//        println("hi#")
//    }

    //3)
    if(false){
        println("1")
    }else if(false){
        println("2")
    }else{
        println("3")
    }

    // in

    println(0 in 1..10)


    //반복

    for(i in 1..10){
        print(i)
    }
    println()

    for(i in 0..1000){
        if(i >999){
            println(i)
        }
    }


}