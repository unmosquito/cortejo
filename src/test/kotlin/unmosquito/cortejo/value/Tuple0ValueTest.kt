package unmosquito.cortejo.value

import io.kotlintest.matchers.shouldBe
import io.kotlintest.specs.StringSpec

/**
 * Tests [Tuple0Value] class.
 *
 * @author Dmitry Komarov <dmitrykomarov1995@gmail.com>
 * @since 23.03.2018
 */
class Tuple0ValueTest : StringSpec() {
    init {
        "should create a tuple of size 0" {
            val tuple = Tuple0Value()

            tuple.arity shouldBe 0
        }
    }
}