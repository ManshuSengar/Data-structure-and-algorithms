import java.util.*;
public class fibonacci{
    public static Scanner scn=new Scanner(System.in);
    public static void fibonacciNumber(int n)
    {
        int n0=0;
        int n1=1;
        int n2=0;
         for(int i=0;i<n;i++)
        {
            n2=n1+n0;
            System.out.println(n0);
            n0=n1;
            n1=n2; 
        }

    }
    public static void main(String[] args)
    {
        int n=scn.nextInt();
        fibonacciNumber(n);

    }
}