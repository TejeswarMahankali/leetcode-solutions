// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public void sample()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        //System.out.println("Start small. Ship something.");
        Main m = new Main();
        m.sample();
        
    }
}