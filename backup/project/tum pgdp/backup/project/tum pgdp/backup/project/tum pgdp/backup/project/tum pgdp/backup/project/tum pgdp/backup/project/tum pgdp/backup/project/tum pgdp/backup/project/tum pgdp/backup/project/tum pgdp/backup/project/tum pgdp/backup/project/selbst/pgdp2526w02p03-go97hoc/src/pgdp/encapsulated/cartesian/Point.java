package pgdp.encapsulated.cartesian;

import pgdp.MathHelpers;

public class Point {

    private double x;
    private double y;

    /*  The constructor takes x and y as parameters, which the
    user of the library relies on. This must be taken into account
    when rewriting the class.
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //  Getters & setters for x and y
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double distanceToOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    /*  Distance to the point 'other'
     *  Note: Accessing 'other.x' is allowed even though x is a private attribute,
     *  because we are still within the 'Point' class, It does not matter
     *  whether the variable access refers to the same or to a different object.
     */
    public double distanceTo(Point other) {
        double dx = x - other.x;
        double dy = y - other.y;

        return Math.sqrt(dx * dx + dy * dy);
    }

}
