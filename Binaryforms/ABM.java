import java.util.Scanner;

public class ABM {
    public static Scanner scn= new Scanner(System.in);
    public static int multiOfsingle(int n,int d,int b){
        int pow=1;
        int finalans=0;
        int carry=0;
        while(n!=0 || carry!=0)
        {
            int s=n%10;
           int  ans=s*d+carry;
            finalans+=(ans%b)*pow;
            carry= carry/b;
            n/=10;
            pow*=10;
        }
        return finalans;
    }

    public static int anybaseAddition(int n1,int n2,int b)
    {
        int carry=0;
         int pow=1;
     int   finalanswer=0;
        while(n1>0 || n2>0 || carry>0)
        {
          int d1=n1%10;
          int d2=n2%10;
          
          int ans=d1+d2+carry;
          finalanswer=finalanswer+(ans%b)*pow;
          carry=ans/b;
          pow=pow*10;
          n1/=10;
          n2/=10;
        }
        return finalanswer;

    }
    public static int multiOfanybase(int n,int m,int b)
    { int d=0;
        int finalanswer=0;
        int pow=1;
       while(m!=0)
       {
           d=m%10;
           m/=10;
           int ans= multiOfsingle(n,d,b);
           ans=ans*pow;
           finalanswer=anybaseAddition(finalanswer, ans, b);
           pow=pow*10;
       }
       return finalanswer;
    }
    public static void main(String[] args) {
        int n=scn.nextInt();
        int m=scn.nextInt();
        int b=scn.nextInt();
        int ans=  multiOfanybase(n,m,b);
        System.out.print(ans);
    }
    
}
