import java.util.*;
class printincresingdecreasing{
    public static Scanner scn = new Scanner(System.in);
    public static void printIncresingDecreasing(int a,int b){
        if(a>b) return;
        System.out.println(a);
        printIncresingDecreasing(a+1,b);
        System.out.println(a);
    }

    public static void main(String[] args)
    {
        // int a=scn.nextInt();
        double b=scn.nextInt();
        // printIncresingDecreasing( a, b);
        System.out.println((2.1)<<b);
    }
}