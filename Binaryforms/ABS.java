import java.util.Scanner;

public class ABS {
    public static Scanner scn=new Scanner(System.in);
   public static void anyBasesubraction(int n1,int n2,int b)
   {
       int pow=1;
       int finalanswer=0;
       int borrow=0;
       while(n1>0 || n2>0 )
       {
         int d1=n1%10;
         int d2=n2%10;
         int ans=borrow+(d1-d2);
         if(ans<0)
         {
             borrow=-1;
             ans=ans+b;
         }
         else{
             borrow=0;
         }
         finalanswer=finalanswer+ans*pow;
         pow*=10;
         n1/=10;
         n2/=10;

       }
           System.out.print(finalanswer);
       
   }
    public static void main(String[] args) {
        int n1=scn.nextInt();
        int n2=scn.nextInt();
        int b=scn.nextInt();
        anyBasesubraction(n1,n2,b);
    }
    
}
