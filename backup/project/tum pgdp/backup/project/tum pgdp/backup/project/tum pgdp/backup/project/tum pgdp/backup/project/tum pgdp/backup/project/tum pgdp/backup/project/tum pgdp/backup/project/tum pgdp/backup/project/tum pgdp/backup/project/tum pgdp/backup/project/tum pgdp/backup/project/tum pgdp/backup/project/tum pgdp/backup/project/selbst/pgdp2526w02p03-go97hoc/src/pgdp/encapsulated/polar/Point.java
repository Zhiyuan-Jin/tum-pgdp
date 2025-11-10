package pgdp.encapsulated.polar;

import pgdp.MathHelpers;

public class Point {

    private double radius;
    private double angle;

    // TODO 2.1: Implement all methods of the Point class based on the new representation using polar coordinates.
    //       When implementing the constructor, make sure that the parameters are still interpreted
    //       as Cartesian coordinates to remain consistent with the "old version".

    public Point(double x, double y) {

    }

    public double getX() {
        return 0.0;
    }

    public double getY() {
        return 0.0;
    }

    public void setX(double x) {

    }

    public void setY(double y) {

    }
  
  	public double getAngle() {
      	return angle;
    }
  
  	public double getRadius() {
      	return radius;
    }

    public double distanceToOrigin() {
        return 0.0;
    }

    public double distanceTo(Point other) {
        return 0.0;
    }

}
