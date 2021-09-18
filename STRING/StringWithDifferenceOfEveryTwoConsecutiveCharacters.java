import java.util.*;
class StringWithDifferenceOfEveryTwoConsecutiveCharacters{
 public static Scanner scn = new Scanner(System.in);
 public static String stringWithDifference(String str)
 {
    StringBuilder sb=new StringBuilder();
    sb.append(str);
    int n=sb.length();
    StringBuilder newStr = new StringBuilder();
    int i=0;
    while(i<n)
    {
       if(i==n-1)
       {
        newStr.append(sb.charAt(i));
       }
       else{

    int r= sb.charAt(i+1)-sb.charAt(i);
       newStr.append(sb.charAt(i));
       newStr.append(r);
       }
       i++;
    }

     return newStr.toString();
 }
 public static void main(String[] args)
 {
    String str=scn.next();
    String answer= stringWithDifference(str);
    System.out.println(answer);
    
 }
}