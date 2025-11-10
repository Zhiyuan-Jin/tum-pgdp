package pgdp.math;

import java.util.ArrayList;


public class ControlStructures {
    public static void main(String[] args) {
        // Für Experimente und für's Testen der Funktionen

        //printCollatz(27);
        //printPowersOfTwoUpTo(0);
        //printTriangle(0);
        //calculateNumberOfDigits(145426);
        //reverseNumber(127123);
        isPalindrome(123321123);
    }

    public static void printCollatz(int n) {
        // TODO

        if (n <= 0) {
            System.out.println("Eingabe muss größer als 0 sein!");
        } else {
            int Länge = 1;
            while (n != 1) {
                Länge++;//1,2
                System.out.print(n + " ");

                if (n % 2 == 0) {
                    n = n / 2;//n=2,1
                } else {
                    n = n * 3 + 1;

                }

            }
            System.out.println(1);
            System.out.println("Länge" + ": " + Länge);//2

        }

    }

    public static void printPowersOfTwoUpTo(int n) {
        // TODO
        ArrayList<Integer> alle = new ArrayList<>();
        int m = 1;
        if (n < 0) {
            System.out.println("Eingabe muss größer als 0 sein!");
        } else {
            while (n >= m) {
                alle.add(m);
                m = m * 2;
            }
            System.out.println(alle);
        }

    }

    public static void printTriangle(int sideLength) {
        // TODO
        if (sideLength <= 0) {
            System.out.println("Eingabe muss größer als 0 sein!");
        } else {
            while (sideLength > 0) {
                System.out.println("*".repeat(sideLength));
                sideLength -= 1;
            }
        }
    }

    public static int calculateNumberOfDigits(int n) {
        // TODO
        int m = 1;

        if (n == 0) {
            return 0;
        } else {
            while (n > 10) {
                m += 1;
                n = n / 10;
            }
            System.out.println(m);
            return m;

        }

    }

    public static int reverseNumber(int n) {
        // TODO
        int m = 0;
        if (n == 0) {
            return 0;
        } else {
            while (n > 0) {
                m = m * 10 + (n % 10);
                n = n / 10;
            }
        }
        System.out.println(m);
        return m;
    }


    public static boolean isPalindrome(int n) {
        // TODO
        return n == reverseNumber(n);
    }
}