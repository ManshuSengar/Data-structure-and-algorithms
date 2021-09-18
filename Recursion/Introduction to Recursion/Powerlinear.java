import java.util.*;

class powerlinear{
    public static Scanner scn = new Scanner(System.in);
    public static int powerLinear(int x,int n){
        return n==0?1:x*powerLinear(x,n-1); // time complexity is o(n)
          
    }
    public static int powerLinear1(int x,int n)
    {
        if(n==0)
           return 1;
        if(n%2==0)
        {
            int answer=powerLinear(x,n/2);
            return answer*answer;      /// time complexity is logn 
        }  
        else{
            int answer=powerLinear(x,n/2);
            return answer*answer*x;
        }

    }
    public static void main(String[] args)
    {
       int x=scn.nextInt();
       int n=scn.nextInt();
       System.out.println(powerLinear(x,n));
       System.out.println(powerLinear1(x,n));
    }
}