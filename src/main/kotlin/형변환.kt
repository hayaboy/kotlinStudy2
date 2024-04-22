fun main(){

    //형변환

    //코틀린에서는 to변수()를 통해 형변환 가능

//    var num:Int
//    num=123


    //1) 숫자를 문자로
    var num:Int=123

    var str1:String=num.toString()
    println(str1)

    //타입 체크하는 연산자  is
    println(str1 is String)

    println(str1 !is String)

    //2) 문자를 숫자로
    var str2:String="77"

    try {
        println(str2.toInt() + 1)
    }catch (e:Exception) {
        println("안됨")
    }







}