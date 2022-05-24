
class Cab_Invoice {
    fun calculateFair(Rides: List<Ride>): Double {
        val D_rate=10.0;
        val T_rate=1.0;
        return Rides.sumOf { it.distance * D_rate + it.time * T_rate}
    }

}
