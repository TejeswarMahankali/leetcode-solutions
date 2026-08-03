
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public void m1() {
        int a[] = { 1, 9, 9, 4, 1 };
        // Arrays.sort(a);
        // System.out.println(a[a.length-1]);
        int c = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                c = a[i];
                a[i] = a[i + 1];
                a[i + 1] = c;
            }
        }
        System.out.println(a[a.length - 1]);
    }

    public static void main(String[] args) {
        // System.out.println("Start small. Ship something.");
        Main m = new Main();
        m.m1();
    }
}