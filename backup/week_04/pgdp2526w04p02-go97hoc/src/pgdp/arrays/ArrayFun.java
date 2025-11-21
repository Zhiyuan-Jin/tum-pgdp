package pgdp.arrays;

public class ArrayFun {
    public static void print(int[] a) {
        // TODO
        System.out.print("{");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    public static void minAndMax(int[] a) {
        // TODO

        if (a.length==0) {
            return;
        } else {
            int min = a[0];
            int max = a[0];
            for (int i = 0; i < a.length; i++) {
                if (a[i] < min) {
                    min = a[i];
                } else if (a[i] > max) {
                    max = a[i];
                }
            }
            System.out.println("Minimum = " + min + ", Maximum = " + max);
        }

    }

    public static int[] invert(int[] a) {
        // TODO
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[a.length - i - 1];
        }
        return b;
    }

    public static int[] cut(int[] a, int length) {
        // TODO
        int[] b = new int[length];
        if (length <= 0) {
            return new int[length];
        }
        for (int i = 0; i < length; i++) {
            if (i < a.length) {
                b[i] = a[i];
            }
        }
        return b;
    }

    public static int[] linearize(int[][] a) {
        // TODO
        int alllength = 0;
        for (int i = 0; i < a.length; i++) {
            alllength += a[i].length;
        }
        int[] b = new int[alllength];
        int index = 0;
        for (int j = 0; j < a.length; j++) {
            for (int i = 0; i < a[j].length; i++) {
                b[index] = a[j][i];
                index++;
            }
        }
        return b;
    }
}
