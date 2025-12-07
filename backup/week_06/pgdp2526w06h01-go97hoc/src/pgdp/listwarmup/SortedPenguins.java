package pgdp.listwarmup;

public class SortedPenguins {

    public static void main(String[] args) {
        System.out.println(sortPenguins(new int[]{8, 3, 2, 1, 7}));
    }

    public static List sortPenguins(int[] ages) {
        // TODO 2: Implement the method.
        List sort=new List();
        for (int i = 0; i < ages.length; i++) {
            sort.insertIntoSorted(ages[i]);
        }

        return sort;
    }
}