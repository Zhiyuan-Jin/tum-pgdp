package funcint;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
    }

    public static void showTableWithExceptionHandling(double start, double end, double step, Function<Double, Double> func) {
        try {
            showTable(start, end, step, func);
        } catch (InvalidRangeException e) {
            System.out.println("error"+e);
        }
    }

    public static void showTable(double start, double end, double step, Function<Double, Double> func) throws InvalidRangeException {
        if (!isValidRange(start, end, step)) {
            throw new InvalidRangeException(start, end, step);
        } else {
            if (step >= 0) {
                for (double i = start; i <= end; i = i + step) {
                    func.apply(i);
                }
            } else {
                for (double i = start; i >= end; i = i + step) {
                    func.apply(i);
                }
            }

        }
    }

    protected static boolean isValidRange(double start, double end, double step) {
        if (step >= 0) {
            return
                    start < end;
        } else {
            return start > end;
        }
        //4, 2, -1 -> 4, 3
        //4, 2, 1 -> Nicht valide

    }
}
