
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public void removeDuplicates() {
        int a[] = { 1, 2, 4, 3, 2, 2, 7 };
        Set<Integer> h = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            h.add(a[i]);
        }
        System.out.println(h);
        Integer b[] = h.toArray(new Integer[0]);
        int c[] = new int[b.length];
        for (int i = 0; i < b.length; i++) {
            c[i] = b[i];
        }
        System.out.println(Arrays.toString(c));

    }

    public static void main(String[] args) {
        // System.out.println("Start small. Ship something.");
        Main m = new Main();
        m.removeDuplicates();
    }
}