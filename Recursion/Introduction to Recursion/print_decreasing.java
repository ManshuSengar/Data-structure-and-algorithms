import java.util.*;

class print_decreasing{
    public static Scanner scn= new Scanner(System.in);
    public static void printDecreasing(int a,int b)
    {
        if(a>b)
          return;
        printDecreasing(a+1,b);
        System.out.println(a);  
    }
    public static void main(String[] args){
        int a=scn.nextInt();
        int b=scn.nextInt();
        printDecreasing(a,b);
        // printIncreasing(a,b);
    }
}