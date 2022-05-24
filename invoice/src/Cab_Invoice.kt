
class Cab_Invoice {

    companion object{
          const val D_rate=10.0;
          const val T_rate=1.0;
        }
        fun calculateFair(Rides: List<Ride>): Double {
        return Rides.sumOf { it?.distance * D_rate + it?.time * T_rate}
    }

}
