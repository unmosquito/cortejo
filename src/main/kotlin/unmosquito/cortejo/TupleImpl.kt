package unmosquito.cortejo

import java.util.Random

class TupleImpl : Tuple {
    override fun hello() {
        val r = Random().nextInt()
        if (r % 2 == 0) {
            println(r)
        }
    }
}