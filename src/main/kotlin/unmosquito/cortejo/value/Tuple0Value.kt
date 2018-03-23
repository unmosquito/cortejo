package unmosquito.cortejo.value

import unmosquito.cortejo.Tuple0

/**
 * A simple and immutable representation of empty tuple.
 *
 * @author Dmitry Komarov <dmitrykomarov1995@gmail.com>
 * @since 23.03.2018
 */
class Tuple0Value : Tuple0 {

    override fun toString(): String = "Tuple0[]"

    override fun equals(other: Any?): Boolean = this === other || other is Tuple0

    override fun hashCode(): Int = 0

}
