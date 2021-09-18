import java.util.*;
class permutation{
   public static Scanner scn =new Scanner(System.in);
   public static void printPermutation(String str,String ans){
  if(str.length()==0)
  {
      System.out.println(ans);
      return;
  }
    for(int i=0;i<str.length();i++){
     char ch=str.charAt(i); 
     String ros=str.substring(0, i)+str.substring(i+1);
     printPermutation(ros, ans+ch); 
    }
   }
   public static StringBuilder duplicatePermutation(String str){
       StringBuilder sb=new StringBuilder();
       int[] freq= new int[26];
       for(int i=0;i<str.length();i++)
       {
           freq[str.charAt(i)-'a']++;
       }
       for(int i=0;i<str.length();i++){
           for(int j=0;j<freq[i];j++){
               sb.append((char)(i+'a'));
           }
       }

       duplicatePermutation1(sb.toString(),"");
       
   }

   public static void duplicatePermutation1(StringBuilder str,String ans){
       if(str.length()==0){
           System.out.println(ans);
           return;
       }
    
    //  StringBuilder sb =  duplicatePermutation(str);
       char prev = '$';
       for(int i=0;i<str.length();i++){
           if(prev ==str.charAt(i)){
               char ch=str.charAt(i);
               prev=ch;
               String ros=str.substring(0, i)+str.substring(i+1);
               duplicatePermutation1(ros,ans+ch); 

           }
        
       }

   }
   public static void main(String[] args) {
       String str= scn.next();
    //    printPermutation(str, ""); 
       duplicatePermutation(str);
   }
}