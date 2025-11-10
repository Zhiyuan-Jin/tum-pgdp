package pgdp.functions;

public class Functions {
        public static void main(String[] args) {
          square(5);
          isPythagoreanTriple(3,4,5);

        }
        public static int square ( int n){
            int square = n * n;
            //System.out.println("Ergebnis"+" "+square);
            return square;

        }

        public static int sumOfSquares ( int a, int b){
            int aSquared = square(a);
            int bSquared = square(b);
            int sum = aSquared + bSquared;

            return sum;
        }

        public static void cube ( int n){
            int c = n * n * n;
            //return ;
            System.out.println(c);
        }

        public static int average ( int a, int b, int c){
            int average = (a + b + c) / 3;
            return average;
        }

        public static boolean isPythagoreanTriple ( int a, int b, int c){
            return  (square(a) + square(b) == square(c));

        }
    }

