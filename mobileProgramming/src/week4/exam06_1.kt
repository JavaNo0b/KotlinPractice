package week4

fun main(){
    var myCar1 : Car1 = Car1("빨강", 0)

    var myCar2 : Car1 = Car1("파랑", 0)

    var myCar3 : Car1 = Car1("초록", 0)

    myCar1.upSpeed(50)
    println("자동차의 색상은 "+myCar1.color+"이며, 속도는 "+myCar1.speed+"km입니다")

    myCar2.upSpeed(20)
    println("자동차의 색상은 "+myCar2.color+"이며, 속도는 "+myCar2.speed+"km입니다")

    myCar3.upSpeed(250)
    println("자동차의 색상은 "+myCar3.color+"이며, 속도는 "+myCar3.speed+"km입니다")
}