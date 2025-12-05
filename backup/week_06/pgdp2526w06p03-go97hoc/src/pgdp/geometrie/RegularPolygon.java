package pgdp.geometrie;

public class RegularPolygon extends BaseArea {
    private int n;
    private double length;


    public RegularPolygon(int n, double length) {
        this.n = n;
        this.length = length;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double circumference() {
        return n * length;
    }

    @Override
    public double area() {
        return (n * length * length) / (4 * Math.tan(Math.PI / n));
    }

    @Override
    public boolean isSquare() {
        return n==4;
    }

    @Override
    public Square toSquare() {
        if (isSquare()) {
            return new Square(length);
        }
        return null;}
}