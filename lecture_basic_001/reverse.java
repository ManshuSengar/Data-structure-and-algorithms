import java.util.*;
    
    public class reverse{
    public static Scanner scn = new     Scanner(System.in);
public static int pow(int c)
{
    int num=1;
    for(int i=0;i<c-1;i++)
    {
        num=num*10;
        
    }
    return num;
}
public static void reverseAnumber(int n)
    {
        // int  num=0;
        int count=0;
        while(n!=0)
        {
            int rem =n%10;
            count++;
            n/=n;
        }
        while(n!=0)
        {
            int num=pow(count);
        int r=n/num;
        System.out.println(r);
        n%=n;
        
        }
    }
  public static void main(String[] args)
    {
        int n= scn.nextInt();
        reverseAnumber(n);
    }
    
    
    }