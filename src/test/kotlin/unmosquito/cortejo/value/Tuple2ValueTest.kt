package unmosquito.cortejo.value

import io.kotlintest.matchers.shouldBe
import io.kotlintest.matchers.shouldEqual
import io.kotlintest.specs.StringSpec

/**
 * Tests [Tuple2Value] class.
 *
 * @author Dmitry Komarov <dmitrykomarov1995@gmail.com>
 * @since 23.03.2018
 */
class Tuple2ValueTest : StringSpec() {
    init {
        "should create a tuple of size 2 and given values" {
            val tuple = Tuple2Value("abc1", "abc2")

            tuple.arity shouldBe 2
            tuple.component1() shouldEqual "abc1"
            tuple.component2() shouldEqual "abc2"
        }
    }
}
