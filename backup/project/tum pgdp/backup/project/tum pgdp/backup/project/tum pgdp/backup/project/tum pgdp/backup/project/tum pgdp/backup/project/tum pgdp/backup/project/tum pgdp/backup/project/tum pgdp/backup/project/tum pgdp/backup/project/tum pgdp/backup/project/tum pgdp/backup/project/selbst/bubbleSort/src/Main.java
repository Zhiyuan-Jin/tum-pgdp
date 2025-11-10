import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

        public static void gnomeSort ( int[] a){
            // TODO: implement gnome sort
            int j = 0;
            for (int i = 0; i < a.length - 1; i++) {
                for (int l = 0; l < a.length - 1 - i; l++) {
                    if (a[l] > a[l + 1]) {
                        j = a[l];
                        a[l] = a[l + 1];
                        a[l + 1] = j;
                    }
                }
            }
        }
    public static void main(String[] args) {
        int[] a = new int[]{5, 4, 2,6};
        gnomeSort(a);
        System.out.println(Arrays.toString(a));
    }

}

