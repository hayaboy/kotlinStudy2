package classtest2


//생성자 파라미터 앞에 var도 사용할 수 있지만, 읽기 전용인 val을 사용하는 것을 권장
class Car2 constructor(val color:String, val speed:Int) {

    //필(프로퍼티)
    //프라이머리 생성자
    init {
        //print("프라이머리 생성자")
        print("차의 색은  ${color}이고, 속도는 ${speed}")
    }

}