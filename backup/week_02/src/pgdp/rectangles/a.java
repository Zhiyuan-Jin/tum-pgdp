package pgdp.rectangles;

public class a {

    public static void main(String[] args) {
        int n1 = 7;

        boolean b1 = n1 < 4 & ++n1 % 1 == 0;

        int n2 = 7;
        boolean b2 = n2 < 4 && ++n2 % 0 == 0;||


        System.out.println("n1 == " + n1);
        System.out.println("b1 == " + b1);
        System.out.println("n2 == " + n2);
        System.out.println("b2 == " + b2);
    }
}
