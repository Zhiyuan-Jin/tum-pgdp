package pgdp.bubblesort;

public class BubbleSort {

    //TODO 1.0: Implement the method to sort a given array in ascending order.
    public static void bubbleSort(int[] fish) {

        for (int i = 0; i < fish.length; i++) {
            for (int j = 0; j < fish.length - 1; j++) {
                if (fish[j] > fish[j + 1]) {
                    int a = fish[j];
                    fish[j] = fish[j + 1];
                    fish[j + 1] = a;
                }
            }
        }
    }
}
