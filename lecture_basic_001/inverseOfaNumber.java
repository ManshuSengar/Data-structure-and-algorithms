import java.util.*;

public class inverseOfaNumber{
public static Scanner scn= new Scanner(System.in);
public static int power(int r)
{
    int pow=1;
    for(int i=1;i<r;i++)
    {
        pow*=10;

    }
    return pow;
}
public static int inverseOfNumber(int n)
{
    int r=0;
    int pow=0;
    int ans=0;
    int c=0;
    while(n!=0)
    {
        c++;
        r= n%10;
       pow=power(r);
       ans=c*pow+ans;
       n/=10;
       
    }
    return ans;
}
public static void main(String[] args)
{
    int n=scn.nextInt();
    int ans=inverseOfNumber(n);
    System.out.print(ans);
}

}