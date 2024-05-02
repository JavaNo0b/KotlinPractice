package week5

//추상클래스 : 인스턴스화를 금지하는 클래스
abstract class Animal {
    var name: String = ""
    //추상메서드
    abstract fun move()
}

// 추상클래스를 상속받을 경우 추상클래스의 추상메서드를 반드시 정의해야한다.
class Tiger : Animal(){
    var age : Int = 0
    override fun move() {
        println("Tiger : 네 발로 이동한다.")
    }
}

class Eagle : Animal(){
    var home : String = ""
    override fun move() {
        println("Eagle : 날개로 날아간다.")
    }
}

fun main(){
    var tiger1 = Tiger()
    var eagle1 = Eagle()

    tiger1.move()
    eagle1.move()
}