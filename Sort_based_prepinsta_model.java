
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public void m2() {
        int a[] = { 1, 90, 34, 89, 7, 9 };
        Arrays.sort(a);
        for (int i = 0; i < a.length / 2; i++) {
            System.out.println(a[i]);
        }
        for (int i = a.length - 1; i >= a.length / 2; i--) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        // System.out.println("Start small. Ship something.");
        Main m = new Main();
        m.m2();
    }
}