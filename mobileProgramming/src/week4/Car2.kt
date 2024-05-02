package week4

class Car2 {
    var color : String = ""
    var speed : Int = 0

    constructor(color: String, speed: Int){
        this.color = color
        this.speed = speed
    }
    constructor(speed: Int){
        this.speed = speed
    }
    constructor(){
    }

    fun upSpeed(value: Int) {
        if(speed+value >= 200)
            speed = 200
        else
            speed = speed + value
    }
    fun downSpeed(value:Int){
        if(speed-value <= 0)
            speed = 0
        else
            speed = speed-value
    }
}