package unmosquito.cortejo

import java.util.*

class TupleImpl : Tuple {
    override fun hello() {
        val r = Random().nextInt()
        if (r % 2 == 0) {
            println(r)
        }
    }
}