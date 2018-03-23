package unmosquito.cortejo.value

import io.kotlintest.matchers.shouldBe
import io.kotlintest.matchers.shouldEqual
import io.kotlintest.specs.StringSpec

/**
 * Tests [Tuple4Value] class.
 *
 * @author Dmitry Komarov <dmitrykomarov1995@gmail.com>
 * @since 23.03.2018
 */
class Tuple4ValueTest : StringSpec() {
    init {
        "should create a tuple of size 4 with given values" {
            val tuple = Tuple4Value("abc1", "abc2", "abc3", "abc4")

            tuple.arity shouldBe 4
            tuple.component1() shouldEqual "abc1"
            tuple.component2() shouldEqual "abc2"
            tuple.component3() shouldEqual "abc3"
            tuple.component4() shouldEqual "abc4"
        }
    }
}
