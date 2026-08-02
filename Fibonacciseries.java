import java.util.*;

class Main {
    public void fibonacci() {
        int n = 10;
        int a = 0;
        int b = 1;
        int c = 0;

        if (n == 1) {
            System.out.println(a);
        } else if (n >= 2) {
            System.out.println(a);
            System.out.println(b);

            for (int i = 2; i < n; i++) {
                c = a + b;
                a = b;
                b = c;
                System.out.println(c);
            }
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.fibonacci();
    }
}