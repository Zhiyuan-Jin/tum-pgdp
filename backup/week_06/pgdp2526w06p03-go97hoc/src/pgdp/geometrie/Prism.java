package pgdp.geometrie;

public class Prism {
    private double height;
    private BaseArea base;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public BaseArea getBase() {
        return base;
    }

    public void setBase(BaseArea base) {
        this.base = base;
    }

    public Prism(BaseArea base, double height) {
        this.height = height;
        this.base = base;
    }

    public double surface() {
        return 2 * base.area() + base.circumference() * height;
    }

    public double volume() {
        return base.area() * height;
    }

    public boolean isCube() {
        if (base.isSquare()) {
            Square sq = base.toSquare();
            if (sq != null) {
                return sq.getLength() == height;
            }
        }
        return false;

    }
}
