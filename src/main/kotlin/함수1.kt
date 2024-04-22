

//1
fun f1(){
    println("hi")
}

//2
fun f2(gift:String){
    println(gift)
}

//3
fun f3():String{
    return "과자"
}

//4
fun f4(gift: String):String{
    println(gift)
    return "과자2"
}

//The root of the Kotlin class hierarchy. Every Kotlin class has Any as a superclass.
fun f5():Any{
    return  arrayOf("가나","다라","마바")
}


fun main() {
   // f1()
   // f2("사탕")
//    var gift:String=f3()
//    println(gift)

//    var gift2:String=f4("탕후루")
//    println(gift2)
    var arr1=f5() as Array<String>
    println(arr1 is Array)

    for(v in arr1){
        println(v)
    }


}

