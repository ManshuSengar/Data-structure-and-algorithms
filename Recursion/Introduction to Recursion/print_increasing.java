import java.util.*;

class print_increasing{
    public static Scanner scn= new Scanner(System.in);
    public static void printIncreasing(int a,int b)
    {
        if(a>b) return;
        System.out.println(a);   
        printIncreasing(a+1,b);
        
    }
    public static void main(String[] args){
        int a=scn.nextInt();
        int b=scn.nextInt();
        printIncreasing(a,b);
    }
}