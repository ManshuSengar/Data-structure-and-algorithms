import java.util.*;

class fibonacciquestion{
    public static Scanner scn =new Scanner(System.in);
    public static int fibonacci(int n){
        if(n<=1)
         return n;
        return fibonacci(n-1) +fibonacci(n-2);
    }
    public static void main(String[] args){
        int n=scn.nextInt();
      System.out.println(fibonacci(n))  ;
    }
}