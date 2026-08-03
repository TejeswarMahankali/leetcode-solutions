
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {

    public void sample3() {
        Scanner sc = new Scanner(System.in);
        int n = 2003;
        if (n % 400 == 0) {
            System.out.println("leap");
        } else if ((n % 4 == 0) && (n % 100 != 0)) {
            System.out.println("not leap");
        }
    }

    public static void main(String[] args) {
        // System.out.println("Start small. Ship something.");
        Main m = new Main();
        m.sample3();

    }
}