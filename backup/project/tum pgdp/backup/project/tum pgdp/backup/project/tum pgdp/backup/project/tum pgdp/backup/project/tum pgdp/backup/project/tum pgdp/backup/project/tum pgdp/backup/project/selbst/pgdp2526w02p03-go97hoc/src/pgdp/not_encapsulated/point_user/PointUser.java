package pgdp.not_encapsulated.point_user;

//TODO 1.2: Change to 'import pgdp.encapsulated.polar.Point;' to simulate an update to the latest version of the Point library.
import pgdp.not_encapsulated.cartesian.Point;

import java.util.Scanner;

//  This class MUST NOT BE MODIFIED! It represents a user of the Point library
//  and is only accessible to the library's developers.

public class PointUser {

    public static void main(String[] args) {
        Point p1 = enterPoint();
        Point p2 = enterPoint();
        displayDistances(p1, p2);

        enterCoordinate(p1, "first", 'x');
        enterCoordinate(p2, "second", 'y');
        displayDistances(p1, p2);
    }

    /**
     * Lets the user enter a point.
     */
    public static Point enterPoint() {
        Scanner in = new Scanner(System.in);
        boolean correctInputGiven = false;
        double x = 0.0, y = 0.0;
        while (!correctInputGiven) {
            System.out.println("Please enter two coordinates, separated by comma:");
            String s = in.nextLine();
            s = s.replaceAll(" ", "");
            String[] numbers = s.split(",");
            try {
                x = Double.parseDouble(numbers[0]);
                y = Double.parseDouble(numbers[1]);
                correctInputGiven = true;
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Wrong input format!");
                System.out.println("Please enter a text of the following form: '<Number>, <Number>'\n");
            }
        }
        return new Point(x, y);
    }

    /**
     * Lets the user reset the coordinate of the given point.
     * @param p the point whose coordinate should be updated
     * @param ordinalNumber the ordinal number of the point
     * @param coord the coordinate to be updated ('x' or 'y')
     */
    public static void enterCoordinate(Point p, String ordinalNumber, char coord) {
        Scanner in = new Scanner(System.in);
        boolean correctInputGiven = false;
        double d = 0.0;
        while (!correctInputGiven) {
            System.out.println(
                    "The " + ordinalNumber + " point currently has coordinates [" + p.x + ", " + p.y + "]. " +
                            "Please enter a new " + coord + "-coordinate.");
            String s = in.nextLine();
            try {
                d = Double.parseDouble(s);
                correctInputGiven = true;
            } catch (NumberFormatException e) {
                System.out.println("Wrong input format!");
                System.out.println("Please enter a number!'\n");
            }
        }
        switch (coord) {
            case 'x' -> p.x = d;
            case 'y' -> p.y = d;
            default -> System.out.println("Something went wrong ...   <--- A+ error message!");
        }
    }

    public static void displayDistances(Point p1, Point p2) {
        System.out.println("--------------------------------");

        // Textausgabe zu Distanz zwischen zwei Punkten
        System.out.println("Distance between [" + p1.x + ", " + p1.y +
                "] and [" + p2.x + ", " + p2.y + "]:");
        System.out.println(p1.distanceTo(p2));

        System.out.println();

        // Textausgabe zu Distanzen zum Ursprung
        System.out.println("Points [" + p1.x + ", " + p1.y +
                "] and [" + p2.x + ", " + p2.y + "] have distances");
        System.out.println("\t" + p1.distanceToOrigin() + " and " +
                p2.distanceToOrigin());
        System.out.println("to the origin.");

        System.out.println("--------------------------------");
    }

}
