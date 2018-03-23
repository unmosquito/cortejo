package unmosquito.cortejo

/**
 * A 2-tuple (double).
 *
 * @param T1 type of first element of tuple.
 * @param T2 type of second element of tuple.
 * @author Dmitry Komarov <komarovdmitry1995@gmail.com>
 * @since 23.03.2018
 */
interface Tuple2<out T1, out T2> : Tuple1<T1> {

    override val arity: Int get() = 2

    /**
     * Returns second element of tuple.
     *
     * @return second element
     */
    operator fun component2(): T2

}
