package week5

class Automobile: Car3 {
    var seatNum : Int = 0

    constructor() {
    }
    fun countSeatNum() : Int{
        return seatNum
    }

    override fun upSpeed(value : Int){
        if(speed+value >= 300)
            speed = 300
        else
            speed = speed+value
    }
}