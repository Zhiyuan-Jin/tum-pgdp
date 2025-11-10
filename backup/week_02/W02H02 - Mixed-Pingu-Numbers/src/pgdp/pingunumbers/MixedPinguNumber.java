package pgdp.pingunumbers;

public class MixedPinguNumber {
    public int numerator;
    public int denominator;
    public int wholePart;

    // TODO 1.0: Implement the constructor and set the attributes.

    public MixedPinguNumber(int numerator, int denominator, int wholePart) {
        this.numerator = numerator;
        this.denominator = denominator;
        this.wholePart = wholePart;
    }

    public void  printAsDouble() {
        // TODO 2.1: Implement the method.
        System.out.println(wholePart + (double) numerator / denominator);
    }

    public void  prettyPrint() {
        // TODO 2.2: Implement the method.
        System.out.println(wholePart + " " + numerator + "/" + denominator);
    }


    public void extractWholePart() {

            wholePart += numerator / denominator;
            numerator = numerator % denominator;

        // TODO 3.1: Implement the method.

    }

    public void mergeWholePart() {
        numerator = wholePart * denominator + numerator;
        wholePart = 0;
        // TODO 3.2: Implement the method.
    }

    public void normalize() {
        // TODO 3.3: Implement the method.
        extractWholePart();
        Utils.reduce(this);
    }


    /**
     * Adds a given PinguNumber to the current one.
     *
     * @param other is the PinguNumber to be added.
     */
    public void add(MixedPinguNumber other) {
        MixedPinguNumber a = new MixedPinguNumber(numerator, denominator, wholePart);
        a.mergeWholePart();
        other.mergeWholePart();
        numerator = a.numerator * other.denominator + other.numerator * a.denominator;
        denominator = a.denominator * other.denominator;
        wholePart = 0;
        normalize();

        // TODO 4.1: Implement the method.
    }

    /**
     * Multiplies the given PinguNumber with the current one.
     *
     * @param other is the PinguNumber to be multiplied.
     */
    public void multiply(MixedPinguNumber other) {
        // TODO 4.2: Implement the method.
        MixedPinguNumber a = new MixedPinguNumber(numerator, denominator, wholePart);
        a.mergeWholePart();
        other.mergeWholePart();
        numerator = a.numerator * other.numerator;
        denominator = a.denominator * other.denominator;
        wholePart = 0;
        normalize();
    }

    public void invert() {
        // TODO 4.3: Implement the method.
        MixedPinguNumber a = new MixedPinguNumber(numerator, denominator, wholePart);
        a.mergeWholePart();
        numerator   = a.denominator;
        denominator = a.numerator;
        wholePart   = 0;
    }
}

