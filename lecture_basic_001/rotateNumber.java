import java.util.*;
   
   public class rotateNumber{
    public static Scanner scn= new Scanner(System.in);
  public static  int count(int n)
    {
        int count=0;
        while(n!=0)
        {
        count++;
        n= n/10;
        }
        return count;
    }
  public static int rotateNumber(int n,int k)
    {
        int a;
        int b;
        int pow=1;
        int multiply=1;
        int r=count(n);
        if(k<0)
        {
            k=k+r;
        }
        else if(k>r)
        {
            k=k-r;
        }
         for(int i=1;i<=r;i++)
            {
                if(i<=k)
                {
                    pow=pow*10;
                }
                else{
                    multiply=multiply*10;
                }
            }
        a=n%pow;
        b=n/multiply;
        n=a*multiply+b;
        
        return n;
    }
   public static void main(String[] args) {
    int n= scn.nextInt();
    int k= scn.nextInt();
    int r;
    r=rotateNumber(n,k);
    System.out.print(r);
    }
   }