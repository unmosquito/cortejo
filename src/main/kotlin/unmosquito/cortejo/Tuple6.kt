package unmosquito.cortejo

/**
 * A 6-tuple (sextuple).
 *
 * @param T1 type of first element of tuple.
 * @param T2 type of second element of tuple.
 * @param T3 type of third element of tuple.
 * @param T4 type of fourth element of tuple.
 * @param T5 type of fifth element of tuple.
 * @param T6 type of sixth element of typle.
 * @author Dmitry Komarov <komarovdmitry1995@gmail.com>
 * @since 23.03.2018
 */
interface Tuple6<out T1, out T2, out T3, out T4, out T5, out T6> : Tuple5<T1, T2, T3, T4, T5> {

    override val arity: Int get() = 6

    /**
     * Returns sixth element of tuple.
     *
     * @return sixth element
     */
    operator fun component6(): T6

}
