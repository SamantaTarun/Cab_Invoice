
class Cab_Invoice {

    companion object{
          const val D_rate=10.0;
          const val T_rate=1.0;
        }

        fun calculateFair_Single(distance : Double, time: Double): Double{
            return distance * D_rate + time * T_rate
        }
        fun calculateFair_Multi(Rides: List<Ride>): Double {
        return Rides.sumOf { it?.distance * D_rate + it?.time * T_rate}
    }

}
