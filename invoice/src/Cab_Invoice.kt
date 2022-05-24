
class Cab_Invoice {
    companion object{
        const val D_rate=10.0;
        const val T_rate=1.0;
    }
    fun calculateFair_Multi(Rides: List<Ride>):Array<Double> {
        val res=Rides.sumOf { it?.distance * D_rate + it?.time * T_rate}

        return  arrayOf(res ,Rides.size.toDouble(), res/Rides.size.toDouble())
    }
    fun calculateFair_Single(distance:Double, time:Double): Double {
        return distance * D_rate + time * T_rate
    }


}
