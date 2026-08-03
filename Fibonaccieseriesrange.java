
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public void m1() {
        int a = 0;
        int b = 1;
        int c = 0;
        int n1 = 10;
        int n2 = 20;
        for (int i = 1; i <= n2; i++) {
            if (i >= n1) {
                System.out.println(a);
            }
            c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.m1();

    }
}