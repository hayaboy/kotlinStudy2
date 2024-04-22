// 1. 2개의 Int 타입 입력 파라미터를 가지고 입력된 2개의 값을 더한 후에 반환하는 함수를 작성

//2. 1개의 Int 타입 입력 파라미터를 가지고 0부터 입력된 값까지
// 순서대로 모두 더한 후에 반환는 함수를 작성

//3 1개의 문자열 입력 파라미터를 가지고 입력된 값을 그대로 출력
fun plus(x:Int, y:Int):Int{
    return x+y
}


fun sum(num:Int):Int{
    var tot:Int=0
    for(i in 0..num){
        tot=tot+i
    }
    return tot
}

fun printStr(str:String){
    print(str)
}



fun main(args: Array<String>) {
//    var res1:Int=plus(1,2)
//    println(res1)
//    var res2:Int=sum(100)
//    println(res2)
    printStr("hi2")

}