import java.util.*;

class factorial{
    public static Scanner scn = new Scanner(System.in);
    public static int factorialOfNumber(int n)
    {
        if(n==0)
          return 1;
        int fact=factorialOfNumber(n-1);
        return fact*n;  
    }
     public static int factorialOfNumber1(int n){
        return n==0?1:factorialOfNumber1(n-1) *n;
     }
    public static void main(String[] args)
    {
        int n=scn.nextInt();
        System.out.println(factorialOfNumber(n));
        System.out.println(factorialOfNumber1(n));
    }
}