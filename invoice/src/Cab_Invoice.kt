class Cab_Invoice {
    fun calculateFair(kms : Double, time : Double): Double {
        val Const = 10.00
        return kms * Const + time
    }
}
