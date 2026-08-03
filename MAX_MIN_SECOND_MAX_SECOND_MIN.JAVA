// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public void m2()
    {
        int a[]={11,22,33,44,22};
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }
            if(min>a[i])
            {
                min=a[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
        int sec_max=Integer.MIN_VALUE;
        int sec_min=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(sec_max<a[i]&&a[i]!=max)
            {
                sec_max=a[i];
            }
            if(sec_min>a[i]&&a[i]!=min)
            {
                sec_min=a[i];
            }
        }
        System.out.println(sec_max);
        System.out.println(sec_min);
    }
    public static void main(String[] args) {
        //System.out.println("Start small. Ship something.");
        Main m = new Main();
        m.m2();
    }
}