//fun main(){
//
//    var num1=null
//    println(num1)
//
//    //
//    print( num1 is Int)
//    //print( num1 is null)
//
////    var num2:Int=null
//
//}

fun main(args: Array<String>):Unit {
    var num1=null
//    println(num1)
//    //
//    print( num1 is Int)
//    print( num1 is null)
//    print( num1 is Unit)

//    var num2:Int?=null
//    println(num2)
//    println( num2 is Int)

//    var arr1= IntArray(1)

    var arr1= ArrayList<Int>(2)

    arr1.add(0)
    arr1.add(1)

    arr1!!.add(100)
    //변수가 null 값이 아니라고 표시해야 하는 경우
    // !!로 나타냄, 이 경우 null 값이 들어가면 오류 발생
    //arr1!!.add(null)

    println(arr1.get(0))
    println(arr1.get(1))

}