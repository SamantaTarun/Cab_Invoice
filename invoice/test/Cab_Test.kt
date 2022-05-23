import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.doubles.shouldBeExactly

class Cab_Test : StringSpec() {
    init {

        "total for 0 kms and 0 mi̦nutes should be Rs.0" {
            val rideOne = Ride(10.0, 1.0)
            Cab_Invoice().calculateFair(listOf<Ride>(rideOne)) shouldBeExactly 11.0
        }

        "total for 1 kms and 21 mi̦nutes should be Rs.21" {
            val rideOne = Ride(0.0, 0.0)
            val rideTwo = Ride(1.0, 1.0)
            val rideThree  = Ride(0.0, 10.0)
            Cab_Invoice().calculateFair(listOf(rideOne, rideTwo, rideThree)) shouldBeExactly  21.0
        }
    }
}
