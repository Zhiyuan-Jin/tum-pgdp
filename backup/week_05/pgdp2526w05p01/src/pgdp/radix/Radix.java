package pgdp.radix;

import java.util.ArrayList;
import java.util.List;

import pgdp.PinguLib;

import static pgdp.PinguLib.*;

public class Radix {

    public static void radixSort(StringList unsorted) {
        int max = 0;
        for (String s : unsorted) {
            if (s.length() > max) {
                max = s.length();
            }
        }
        List<List<String>> bucket = new ArrayList<>();
        for (int i = 0; i < 256; i++) {
            bucket.add(new ArrayList<>());
        }
        for (int i = max - 1; i >= 0; i--) {
            for (List<String> b : bucket) {
                b.clear();
            }
            for (String s : unsorted) {
                char c = charAt(s, i);
                bucket.get(c).add(s);
            }
            unsorted.clear();

            for (List<String> b : bucket) {
                unsorted.addAll(b);
            }
        }

    }
}
