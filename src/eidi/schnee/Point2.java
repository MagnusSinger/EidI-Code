package eidi.schnee;

public class Point2 {
    private double x, y;

    public Point2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public void set(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     *
     * @param phi Winkel um den der Punkt gedreht werden soll
     * @return Veränderter Punkt nach Drehung
     */
    Point2 rotate(double phi) {
        // Note that we change this point directly instead of returning a new one
        set(x * Math.cos(phi) - y * Math.sin(phi), y * Math.cos(phi) + x * Math.sin(phi));
        return this;
    }

    /**
     *
     * @param x X-Wert, um den der Punkt verschoben werden soll
     * @param y Y-Wert, um den der Punkt verschoben werden soll
     * @return Veränderter Punkt nach Verschiebung
     */
    Point2 translate(double x, double y) {
        set(this.x + x, this.y + y);
        return this;
    }

    /**
     *
     * @param angle Winkel um den der Punkt gedreht werden soll
     * @param x X-Wert, um den der Punkt verschoben werden soll
     * @param y Y-Wert, um den der Punkt verschoben werden soll
     * @return Veränderter Punkt nach Drehung und Verschiebung
     */
    Point2 rotateAndTranslate(double angle, double x, double y) {
        return this.rotate(angle).translate(x, y);
    }
}
