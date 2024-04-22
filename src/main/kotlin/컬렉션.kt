fun main(){
    //컬렉션(리, 셋, 맵)

    var li1=listOf(5,3,4)
    println(li1)
    var li2=listOf("짜","짬","볶")
    println(li2)
    println(li2[0])
   // li2[0]="짜장"
    //값 변경할 수 있다. (mutable)

    var li3=mutableListOf("짜","짬",1)
    li3[0]="짜장"
    println(li3)

    var li4=mutableListOf<String>("짜","짬","뽁")
    li4[0]="짜장"
    println(li4)

}