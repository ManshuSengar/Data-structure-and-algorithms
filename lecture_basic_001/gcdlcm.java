import java.util.*;
public class gcdlcm{
public static Scanner scn=new Scanner(System.in);
public static int gcd(int n1,int n2)
{
    int gcd=0;
    while(n1%n2!=0)
    {
       gcd=n1%n2;
       n1=n2;
       n2=gcd; 
    }
    return gcd;
}
public static void main(String[] args)
{
    int n1=scn.nextInt();
    int n2=scn.nextInt();
    int gcd=gcd(n1,n2);
    int lcm=(n1*n2)/gcd;
     System.out.println(gcd);
    System.out.print(lcm);
}

}