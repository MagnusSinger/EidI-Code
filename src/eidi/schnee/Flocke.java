package eidi.schnee;

public class Flocke {

    PointListElement first, last;

    public Flocke(Point2 p1, Point2 p2) {
        first = new PointListElement(p1);
        last = new PointListElement(p2);
        first.setNext(last);
    }

    public void rekursivSchneiden(PointListElement p1, PointListElement p2, int depth) {
        double angle, shiftx, shifty;
        Point2 hp;
        PointListElement q1, q2, q3;

        if (depth > 0) {
            shiftx = p1.getP().getX();
            shifty = p1.getP().getY();
            p1.getP().set(0.0, 0.0);
            p2.getP().translate(-shiftx, -shifty);

            angle = Math.atan(p2.getP().getY() / p2.getP().getX());
            p2.getP().rotate(-angle);

            hp = new Point2(p2.getP().getX() / 3.0, 0.0);
            q1 = new PointListElement(hp.rotateAndTranslate(angle, shiftx, shifty));
            hp = new Point2(p2.getP().getX() / 2.0, p2.getP().getX() / 6.0 * Math.sqrt(3.0));
            q2 = new PointListElement(hp.rotateAndTranslate(angle, shiftx, shifty));
            hp = new Point2(2.0 * p2.getP().getX() / 3.0, 0.0);
            q3 = new PointListElement(hp.rotateAndTranslate(angle, shiftx, shifty));

            p1.setNext(q1);
            q1.setNext(q2);
            q2.setNext(q3);
            q3.setNext(p2);

            p2.getP().rotateAndTranslate(angle, shiftx, shifty);
            p1.getP().translate(shiftx, shifty);

            rekursivSchneiden(p1, q1, depth - 1);
            rekursivSchneiden(q1, q2, depth - 1);
            rekursivSchneiden(q2, q3, depth - 1);
            rekursivSchneiden(q3, p2, depth - 1);
        }
    }
}
