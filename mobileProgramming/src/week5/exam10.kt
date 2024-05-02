package week5

interface iAnimal {
    abstract fun eat()
}

class iCat: iAnimal {
    override fun eat() {
        println("iCat : 생선을 좋아한다.")
    }
}
class iTiger: Animal(), iAnimal {
    override fun eat() {
        println("iTiger : 멧돼지를 잡아먹는다.")
    }

    override fun move() {
        println("iTiger : 네 발로 이동한다.")
    }
}

class Eagle1 : Animal(){
    var home : String = ""
    override fun move() {
        println("Eagle : 날개로 날아간다.")
    }
}

fun main() {
    var cat = iCat()
    cat.eat()

    var tiger = iTiger()
    tiger.move()
    tiger.eat()
}
