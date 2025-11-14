package pgdp.pingunumbers;

public class Main {

    //TODO 5.0: Uncomment and extend to test your implementation using the main method below.
    public static void main(String[] args) {
       /* MixedPinguNumber p1 = new MixedPinguNumber(7, 2, 3); // 3 + 7/2 = 6 1/2 expected
        p1.prettyPrint();
        p1.extractWholePart();
        p1.prettyPrint(); // Expected: 6 1/2
        System.out.println();

        */
MixedPinguNumber a=new MixedPinguNumber(1,4,1);//5/4
        MixedPinguNumber b=new MixedPinguNumber(1,2,2);//5/2
        a.multiply(b);
    }
}
