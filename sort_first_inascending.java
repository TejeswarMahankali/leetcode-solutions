
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    void m1() {
        int a[] = { 1, 90, 34, 89, 7, 9 };
        for (int i = 0; i < a.length / 2; i++) {
            if (a[i] > a[i + 1]) {
                int c = a[i];
                a[i] = a[i + 1];
                a[i + 1] = c;
            }
        }
        for (int i = a.length / 2; i < a.length - 1; i++) {
            if (a[i] < a[i + 1]) {
                int c = a[i];
                a[i] = a[i + 1];
                a[i + 1] = c;
            }
        }
        System.out.println(Arrays.toString(a));
        // output [1, 34, 89, 90, 9, 7]
    }

    public static void main(String[] args) {
        // System.out.println("Start small. Ship something.");
        Main m = new Main();
        m.m1();

    }
}