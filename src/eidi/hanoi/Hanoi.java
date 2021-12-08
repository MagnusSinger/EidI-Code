package eidi.hanoi;

import eidi.Util;

public class Hanoi {

    public static byte free(byte a, byte b) {
        return (byte) (3 - (a+b));
    }

    public static void move(int h, byte a, byte b) {
        if (h > 0) {
            byte c = free(a, b);
            move(h - 1, a, c);
            System.out.print("\tmove " + a + " to " + b + "\n");
            move(h - 1, c, b);
        }
    }

    public static void main(String[] args) {
        int h = Util.readInt("Höhe des Turms: ");
        System.out.print("\n\n");
        move(h, (byte) 0, (byte) 2);
        System.out.print("\n\n");
    }

}
