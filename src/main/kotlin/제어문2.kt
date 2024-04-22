
fun main(){

    //Kotlin에는 Java와 유사한 switch 문이 없습니다. 대신 Kotlin은 when 표현식을 사용하여 비슷한 기능을 제공합니다.
    // switch case  : 해당 값이 정확히 일치할 경우 처리
    // 코틀린의 when문은 다른 언어와 다르게    같은 값 처리 뿐만 아니라 범위 값도 처리


    var score:Int=0
//    switch (menu){
//        case:
//    }

    //문법
//    when(파라미터){//
//        비교값1 -> { }
//        비교값2 -> { }
//        else   -> { }
//    }

    when(score){
        in 90..100 -> {
            println("A")
        }
        in 80..89 -> {
            println("B")
        }
        in 70..79 -> {
            println("C")
        }
        else -> {
            println("D")
        }
    }

    var menu :String="유린기"
    when(menu){
       "짜장", "간짜장" -> { println("1000원")}
       "짬뽕", "백짬뽕" -> { println("2000원")}
        else->{println("3000원")}
    }

}
