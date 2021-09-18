import java.util.*;

class count_of_hi{
 public static Scanner scn=new Scanner(System.in);

public static void countOfHi(String str)
{
    int n=str.length();
    int i=0;
    int count=0;
    while(i<n-1)
    {
        if(i<n && str.charAt(i)=='h' && str.charAt(i+1)=='i')
        {
            count++;
            i+=2;
        }
        else
        {
            i++;
        }
       
    }
    System.out.println(count);
}

public static void countOfHiWithoutHit(String str)
{
    int n=str.length();
    if(n==0)
    {
        return;
    }
    int i=0;
    int count=0;
    while(i<n-1)
    {
        if(i<n && str.charAt(i)=='h' && str.charAt(i+1)=='i')
        {
            if(i+2<n && str.charAt(i+2)=='t')
            {
                i+=3;

            } 
            else{
                count++;
                i+=2;
            }
        }
        else{
            i++;
        }
    }
    System.out.println(count);
   
}

 public static void main(String[] args){
    String str=scn.next();
    // countOfHi(str);
     countOfHiWithoutHit(str);

 }

}