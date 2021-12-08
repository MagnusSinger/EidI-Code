package eidi.binsuche;

public class Main {

    public static void main(String[] args) {
        int[] a = { -3, -1, 3, 8, 83, 93, 222, 1929 };
        int x = 8;
        // + 1 da er bei 0 anfängt zu zählen
        System.out.println("Die Zahl " + x + " befindet sich im Array an Stelle " + (find(a, x) + 1));
    }

    /**
     @param a Array das durchsucht wird
     @param x das zu suchende Element
     @return index der Zahl im Array
     */
    public static int find(int[] a, int x) {
        return find0(a, x, 0, a.length - 1);
    }

    /**
     *
     * @param a Array das durchsucht wird
     * @param x die zu suchende Zahl
     * @param n1 der linke Rand
     * @param n2 der rechte Rand
     * @return index der Zahl im Array
     */
    public static int find0(int[] a, int x, int n1, int n2) {
        int t = (n1 + n2) / 2;
        if (a[t] == x) {
            return t;
        } else if (n1 == n2) {
            // Nicht gefunden
            return -1;
        } else if (x > a[t]) {
            // Gesuchte Zahl ist größer als die Zahl in der Mitte, es wird rechts gesucht
            return find0(a, x, t+1, n2);
        } else if (n1 < t) {
            // Checken ob weniger als zwei Elemente übrig sind wegen abrunden,
            // dann links suchen da Zahl automatisch größer, wenn wir hier angekommen sind
            return find0(a, x, n1, t - 1);
        } else {
            return -1;
        }
    }

}
