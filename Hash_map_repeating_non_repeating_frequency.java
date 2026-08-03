
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public void m2() {
        int a[] = { 1, 4, 2, 9, 0, 3, 2, 4, 3, 2, 1, 9 };
        Map<Integer, Integer> h = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (h.containsKey(a[i])) {
                h.put(a[i], h.get(a[i]) + 1);
            } else {
                h.put(a[i], 1);
            }
        }
        System.out.println(h);
        // System.out.println(h.get(a[a.length-1]));
        System.out.println(h.keySet());
        System.out.println(h.values());
        for (Integer key : h.keySet()) {
            // System.out.println(key+" "+h.get(key));
            if (h.get(key) >= 2) {
                System.out.println(key + " " + h.get(key));
            } else {
                System.out.println(key + " " + h.get(key));
            }
        }

    }

    public static void main(String[] args) {
        Main m = new Main();
        m.m2();
    }
}