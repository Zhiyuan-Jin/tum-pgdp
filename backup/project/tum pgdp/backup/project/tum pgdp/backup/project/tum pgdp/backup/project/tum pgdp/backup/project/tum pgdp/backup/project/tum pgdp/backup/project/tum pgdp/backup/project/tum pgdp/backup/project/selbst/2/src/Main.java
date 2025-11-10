public class Main {
    public static void main(String[] args) {
        int number = 7;
        int squaredNumber = square(number);
        System.out.println(
                number
                        + " zum Quadrat ist "
                        + squaredNumber
        );
    }

    public static int square(int n) {
        int squared = n * n;
        return squared;

    }
}