package unmosquito.cortejo

/**
 * A 7-tuple (septuple).
 *
 * @param T1 type of first element of tuple.
 * @param T2 type of second element of tuple.
 * @param T3 type of third element of tuple.
 * @param T4 type of fourth element of tuple.
 * @param T5 type of fifth element of tuple.
 * @param T6 type of sixth element of tuple.
 * @param T7 type of seventh element of tuple.
 * @author Dmitry Komarov <komarovdmitry1995@gmail.com>
 * @since 23.03.2018
 */
interface Tuple7<out T1, out T2, out T3, out T4, out T5, out T6, out T7>
    : Tuple6<T1, T2, T3, T4, T5, T6> {

    override val arity: Int get() = 7

    /**
     * Returns seventh element of tuple.
     *
     * @return seventh element
     */
    operator fun component7(): T7

}
