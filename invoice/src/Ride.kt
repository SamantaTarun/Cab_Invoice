data class Ride(val distance: Double, val time: Double){

    companion object{
        const val D_rate=10.0;
        const val T_rate=1.0;
    }

    fun calculateFair_Single(): Double{
        return distance * D_rate + time * T_rate
    }

}
