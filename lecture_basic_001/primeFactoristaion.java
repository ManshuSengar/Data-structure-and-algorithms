import java.util.*;
public class primeFactoristaion{
public static Scanner scn= new Scanner(System.in);
public static void primeFactor(int n)
{   
    int i=2;
    while(n>=2)
    {
        if(n%i==0)
        {
         n=n/i;
         System.out.print(i);
         i=2;
        }
        else{
            i++;
        }
    }
}
public static void main(String[] args)
{
  int n=scn.nextInt();
  primeFactor(n);
}
}