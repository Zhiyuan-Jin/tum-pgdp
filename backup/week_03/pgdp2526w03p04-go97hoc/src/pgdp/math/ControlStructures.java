package pgdp.math;

import java.util.Scanner;

public class ControlStructures {
    public static void main(String[] args) {
        //printTriangle(5);

    }

    public static void printTriangle(int sideLength) {

    }

    public static void printCollatz(int n) {

    }

    public static int readInt(String prompt) {
        System.out.println(prompt);
        Scanner in = new Scanner(System.in);
        while(true) {
            try {
                return Integer.parseInt(in.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Das hat nicht geklappt. Bitte gib eine Zahl ein:");
            }
        }
    }

    public static void threeAndSeven() {

    }

    public static int sumOfDigits(int n) {

        return -1;
    }


    public static int reverseNumber(int n) {
        return -1;
    }

    public static boolean isPalindrome(int n) {
        return false;
    }


    public static void printPyramid(int height) {

    }

    public static void printPrimesUpTo(int n) {

    }

}
