
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    void sample4() {
        Scanner sc = new Scanner(System.in);
        int n1 = 2;
        int n2 = 16;
        for (int i = n1; i <= n2; i++) {
            if (check(i)) {
                System.out.println(i);
            }
        }
    }

    boolean check(int n) {
        if (n <= 1) {
            return false;
        } else {
            for (int i = 2; i < n / 2; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // System.out.println("Start small. Ship something.");
        Main m = new Main();
        m.sample4();
    }
}