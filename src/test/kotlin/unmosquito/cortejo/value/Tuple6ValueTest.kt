package unmosquito.cortejo.value

import io.kotlintest.matchers.shouldBe
import io.kotlintest.matchers.shouldEqual
import io.kotlintest.specs.StringSpec

/**
 * Tests [Tuple6Value] class.
 *
 * @author Dmitry Komarov <dmitrykomarov1995@gmail.com>
 * @since 23.03.2018
 */
class Tuple6ValueTest : StringSpec() {
    init {
        "should create a tuple of size 6 with given values" {
            val tuple = Tuple6Value("abc1", "abc2", "abc3", "abc4", "abc5", "abc6")

            tuple.arity shouldBe 6
            tuple.component1() shouldEqual "abc1"
            tuple.component2() shouldEqual "abc2"
            tuple.component3() shouldEqual "abc3"
            tuple.component4() shouldEqual "abc4"
            tuple.component5() shouldEqual "abc5"
            tuple.component6() shouldEqual "abc6"
        }
    }
}