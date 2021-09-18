import java.util.*;
 public class l002{
 public static Scanner scn = new Scanner(System.in);
public static boolean isPrime(int n)
 {
    for(int i=2;i*i<n;i++)
    {
        if(n%i==0)
        {
            return false;
        }
    }
    return true;
 }
 public static void solve()
 {
     
        int n=scn.nextInt();
        boolean res= isPrime(n);
        if(res==true)
        {
          System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }  
 }
 
  public static void main(String[] args) {
     
       
        int t=scn.nextInt();
        for(int i=0;i<t;i++)
        {
            solve();
        }
        }
      
    
       
  
    }
  