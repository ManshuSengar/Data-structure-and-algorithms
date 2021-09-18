import java.util.Scanner;

public class binaryforms{
    public static Scanner scn=new Scanner(System.in);
    public static void DTB(int n)
    {
        int pow=1;
        int ans=0;
        while(n!=0)
        {
            int d=n%2;
            ans=ans+d*pow;
            pow=pow*10;
            n/=2;
        }
        System.out.print(ans);
    }
    public static void BTD(int n)
    {
    int  pow=1;
        int ans=0;
        while(n!=0)
        {
         int d=n%10;
         ans=ans+d*pow;
         pow=pow*2;
         n/=10;
        }
        System.out.print(ans);
    }
        
    
     public static void main(String[] args) {
         int n=scn.nextInt();
        //  DTB(n);
         BTD(n);
        
    }
    

}
