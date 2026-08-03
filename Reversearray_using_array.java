
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public void m2() {
        int a[] = { 2, 3, 4, 5, 6, 9 };
        int b[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[a.length - i - 1];
        }
        System.out.println(Arrays.toString(b));
    }

    public static void main(String[] args) {
        // System.out.println("Start small. Ship something.");
        Main m = new Main();
        m.m2();
    }
}