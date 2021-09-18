import java.util.Scanner;
public class ABA {
    public static Scanner scn=new Scanner(System.in);
    public static void anybaseAddition(int n1,int n2,int b)
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
        System.out.println(finalanswer);

    }
    
    public static void main(String[] args) {
        int n1=scn.nextInt();
        int n2=scn.nextInt();
        int b=scn.nextInt();
        anybaseAddition(n1,n2,b);

        // decimalToanybase(n,b);
       
   }
    
}

    

