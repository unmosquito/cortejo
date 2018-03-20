package unmosquito.cortejo

import io.kotlintest.specs.StringSpec

class TupleTest : StringSpec() {
    init {
        "should be tested" {
            val subject = TupleImpl()
            val datik = Data("Hello, world!")
        }
    }
}