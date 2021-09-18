import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.*;

public class funny{

    /*
     * Complete the 'funnyString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String funnyString(String s) {
        int n=s.length();
        int[] arr1= new int[n];
        int[] arr2= new int[n];
        String ans="";

        int j=s.length()-1;
        for(int i=0;i<n && 0<=j;i++,j--){
            arr1[i]=s.charAt(i);
            arr2[i]=s.charAt(j);

        }
        for(int i=0;i<arr1.length-1;i++){
            int n1=arr1[i]-arr1[i+1];
            n1=n1<0?n1*-1:n1;
            int n2=arr2[i]-arr2[i+1];
            n2=n2<0?n2*-1:n2;
            if(n1!=n2){
                return ans+"Not Funny";
            }
        }
        return ans+"Funny";
        
    // Write your code here

    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        System.out.println(n);
        for(int i=0;i<n;i++){
           String s=scn.next();
           System.out.println(funnyString(s));   
        }
    }
    
    

}

