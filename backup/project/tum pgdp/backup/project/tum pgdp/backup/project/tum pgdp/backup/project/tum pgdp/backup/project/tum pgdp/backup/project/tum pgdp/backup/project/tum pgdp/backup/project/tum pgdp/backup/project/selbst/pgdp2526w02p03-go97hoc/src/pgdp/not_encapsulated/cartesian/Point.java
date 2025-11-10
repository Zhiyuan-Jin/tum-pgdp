package pgdp.not_encapsulated.cartesian;

import pgdp.MathHelpers;

public class Point {

    public double x;
    public double y;

    /*  The constructor takes x and y as parameters, which the
    user of the library relies on. This must be taken into account
    when rewriting the class.
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceToOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    public double distanceTo(Point other) {
        double dx = x - other.x;
        double dy = y - other.y;

        return Math.sqrt(dx * dx + dy * dy);
    }

}
