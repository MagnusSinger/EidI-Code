package eidi.schnee;

public class PointListElement {

    private Point2 p;
    private PointListElement next;

    public PointListElement(Point2 p) {
        setP(p);
        setNext(null);
    }

    public Point2 getP() {
        return p;
    }

    public PointListElement getNext() {
        return next;
    }

    public void setP(Point2 p) {
        this.p = p;
    }

    public void setNext(PointListElement next) {
        this.next = next;
    }
}
