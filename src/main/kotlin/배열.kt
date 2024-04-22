fun main() {

    //var arr1=Array(3)

    // 배열 선언과 할당을 각각
    var intArr = IntArray(3)
//    println(intArr)
    println("${intArr[0]}, ${intArr[1]} , ${intArr[2]}")

    intArr[0] = 1
    intArr[1] = 2
    intArr[2] = 3
    println("${intArr[0]}, ${intArr[1]} , ${intArr[2]}")


    // 배열 선언과 할당을 한번에
    //var intArr2=IntArray(3){4,5,6}
    var intArr2 = arrayOf(3, 4, 5)
    println("${intArr2[0]}, ${intArr2[1]} , ${intArr2[2]}")


    for (v in intArr2) {
        print(v)
        print(v is Int)
    }

    println()
    // 배열요서 타입 정한 후 선언과 할당을 한번에
    var intArr3 = intArrayOf(6, 7, 8)

    for (v in intArr3) {
        print(v)
        print(v is Int)
    }
    println()
    for (i in 1..10 step 2) {
        print(i)
    }
    println("==================")

    var result=1
    while(result < 100){
        result += result // result = result +result
    }
    println(result)

    println("==================")


// 배열요서 타입 정한 후 선언과 할당을 한번에
    var strArr4 = arrayOf("가나","다라","마바")

    for(v in strArr4){
        println(v)
    }


}