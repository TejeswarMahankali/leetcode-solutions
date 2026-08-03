
//frequency counting , repeating , non repeating
import java.util.*;

class Main {
    public void m2() {
        int a[] = { 2, 2, 3, 4, 5, 5 };
        ArrayList<Integer> r = new ArrayList<>();
        ArrayList<Integer> nr = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            int count = 1;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }

            }
            System.out.println(a[i] + " count = " + count);
            if (count >= 2) {
                r.add(a[i]);
            } else {
                nr.add(a[i]);
            }
            i = i + (count - 1);
        }
        System.out.println(r);
        System.out.println(nr);
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.m2();
    }
}