package eidi.mergesort;

import eidi.List;

public class MergeSort {

    /**
     * Mergt zwei Listen
     * @param a Liste 1
     * @param b Liste 2
     * @return Die gemergte Liste
     */
    public static List<Integer> merge(List<Integer> a, List<Integer> b) {
        if (b == null) {
            return a;
        }
        if (a == null) {
            return b;
        }

        if (b.getInfo() > a.getInfo()) {
            a.setNext(merge(a.getNext(), b));
            return a;
        } else {
            b.setNext(merge(a, b.getNext()));
            return b;
        }
    }

    /**
     * Sortiert eine gegebene Liste
     * @param a Liste welche sortiert werden soll
     * @return Sortierte Liste
     */
    public static List<Integer> sort(List<Integer> a) {
        if (a == null || a.getNext() == null) {
            return a;
        }

        List<Integer> b = a.half();
        a = sort(a);
        b = sort(b);
        return merge(a, b);
    }

}
