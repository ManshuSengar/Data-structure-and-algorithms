import java.util.*;

class subsequence{
    public static Scanner scn = new Scanner(System.in);
    public static String subSequence(String str)
    {
        if(str.length==0)
          return "";
       String ans= subSequence(str+1,str.length-1) ;
       String answer="";
       for(int i=0;i<str.length;i++)
       {
        answer= str.charAt(0) + ans.charAt(i);
       }
       return answer;


    }
    public static void main(String[] arg){
        String str=scn.next();
     String answer=subSequence(str);
     System.out.println(answer);
    }
}