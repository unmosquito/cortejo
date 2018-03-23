package unmosquito.cortejo.value

import io.kotlintest.matchers.shouldBe
import io.kotlintest.matchers.shouldEqual
import io.kotlintest.specs.StringSpec

/**
 * Tests [Tuple1Value] class.
 *
 * @author Dmitry Komarov <dmitrykomarov1995@gmail.com>
 * @since 23.03.2018
 */
class Tuple1ValueTest : StringSpec() {
    init {
        "should create a tuple of size 1 and given value 'abc'" {
            val tuple = Tuple1Value("abc")

            tuple.arity shouldBe 1
            tuple.component1() shouldEqual "abc"
        }
    }
}
