fun main() {
    var carAll = Car("Jeep", "Willys", "Grey", 120)
    carAll.carry(30)
    carAll.Identity()
    println(carAll.CalculateParkingFees(9))

    var x = Bus("Benzin", "Doubledeca", "Blue", 44)
    println(x.maxiFareTrip(250.00))

    println(x.CalculateParkingFees(9))


}

open class Car (var make:String, var model: String, var color:String, var capacity:Int){
    fun carry(people:Int){
        var passenger = people - capacity
        if (people<=capacity){
            println("Carrying $people passengers")
        }

        else {
            println("High amount $passenger")
        }

    }

    fun Identity(){
        var Id = "Iam a $color $make $model"
        println(Id)
    }

    open fun CalculateParkingFees(hours:Int):Int{
        var fee = 60
        var totalAmount = fee * hours
        return totalAmount

    }

}

class Bus (make:String,model:String, color:String, capacity: Int):Car(make,model,color,capacity){

    fun maxiFareTrip(fare:Double):Double{
        var max = 200
        var total = max * fare

        return total
    }

    override fun CalculateParkingFees(hours: Int):Int {
        var fee = hours * capacity

        return fee
    }
}


