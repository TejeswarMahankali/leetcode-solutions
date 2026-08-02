
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public void sample2() {
        int n = 2;
        boolean b = true;
        if (n <= 1) {
            System.out.println("not prime");
        } else {
            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i == 0) {
                    b = false;
                    break;
                }
            }
        }
        if (b) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }

    public static void main(String[] args) {
        // System.out.println("Start small. Ship something.");
        Main m = new Main();
        m.sample2();
    }
}