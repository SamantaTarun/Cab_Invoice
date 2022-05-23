import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.booleans.shouldBeFalse
import org.junit.jupiter.api.Assertions.assertEquals

class Cab_Test : StringSpec() {

    init {

        "Total fare for 1 kms and 1 minute should be Rs.11" {

            assertEquals(11.0,Cab_Invoice().calculateFair(1.00 , 1.00))
        }

        "Total fare for 5 kms and 3 minute should be Rs.53" {

            assertEquals(53.0,Cab_Invoice().calculateFair(5.00 , 3.00))
        }

        "Total fare for 9 kms and 9.5 minute should be Rs.99.50" {

            assertEquals(99.5,Cab_Invoice().calculateFair(9.00 , 9.50))
        }
        "Total fare for 0 kms and 10 minute should be Rs.10" {

            assertEquals(10.0,Cab_Invoice().calculateFair(0.00 , 10.00))
        }

    }
}
