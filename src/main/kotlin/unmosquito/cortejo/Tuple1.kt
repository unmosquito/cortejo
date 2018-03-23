package unmosquito.cortejo

/**
 * A 1-tuple (single).
 *
 * @param <T1> type of first element of tuple.
 * @author Dmitry Komarov <komarovdmitry1995@gmail.com>
 * @since 23.03.2018
 */
interface Tuple1<out T1> : Tuple0 {

    override val arity: Int get() = 1

    /**
     * Returns first element of tuple.
     *
     * @return first element
     */
    operator fun component1(): T1

}
