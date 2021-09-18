import java.util.Scanner;

public class ABTD {
    public static Scanner scn=new Scanner(System.in);
    public static void decimalToanybase(int n,int b)
    {
    int pow=1;
    int ans=0;
    while(n!=0)
    {
        int d=n%b;
        ans=ans+d*pow;
        n/=b;
        pow=pow*10;
    }
        System.out.print(ans);
    }
    public static void main(String[] args) {
        int n=scn.nextInt();
        int b=scn.nextInt();
        decimalToanybase(n,b);
       
   }


    
}
