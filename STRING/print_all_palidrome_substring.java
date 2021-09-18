import java.util.*;
import java.io.*;


class print_all_palidrome_substring{

   public static boolean isPalidrome(String str, int si,int ei)
   {
       while(si<ei)
       {
        if(str. charAt(si)!= str.charAt(ei)){
            return false;
           }
               
            si++;
            ei--;   
       }
       return true;
   }




   public static void printSubstring(String str){
       int n=str.length();
       for(int i=0;i<n;i++){
           for(int j=i;j<n;j++){
              if(isPalidrome(str, i, j)) {
                String s=str.substring(i, j+1);
                System.out.println(s);
              }
           }
       }
   }

    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
      String str= scn.next();
      printSubstring(str);
    }
}
