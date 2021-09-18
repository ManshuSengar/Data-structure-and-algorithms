// import java.util.*;
//  public class prime{
//  public static Scanner scn = new Scanner(System.in);
// public static boolean isPrime(int n)
//  {
//     for(int i=2;i*i<=n;i++)
//     {
//         if(n%i==0)
//         {
//             return false;
//         }
//     }
//     return true;
//  }
//  public static void solve(int low,int high)
//  {
     
//         for(int i=low;i<=high;i++)
//         {
//         boolean res= isPrime(i);
//         if(res==true)
//         {
//           System.out.println(i);
//         }
//         }
       
//  }
 
//   public static void main(String[] args) {
//     int low=scn.nextInt();
//     int high=scn.nextInt(); 
//     solve(low,high);
//         }
//   }




  ///new question


  import java.util.*;
    
    public class prime{
    public static Scanner scn = new Scanner(System.in);
public static int power(int n)
{
    int num=1;
    n/=10;
    while(n!=0)
    {
      num*=10;
      n/=10;
    }
    return num;
}
public static void reverseAnumber(int n)
    {
    int pow=power(n);
     while(n!=0)
     {
        int rem=n/pow;
        System.out.println(rem);
        n%=pow;
        pow/=10;
        
     }
        }
    
  public static void main(String[] args)
    {
        int n= scn.nextInt();
        reverseAnumber(n);
    }
    
    }