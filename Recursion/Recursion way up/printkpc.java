 import java.util.*;

public class printkpc {
    public static Scanner scn = new Scanner(System.in);
    public static String[] nokia= {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void PrintKpc(String str,String ans){
      if(str.length()==0)
      {
          System.out.println(ans);
          return;
      }
        char ch=str.charAt(0);
        String ros=str.substring(1);
        String myCode=nokia[ch-'0'];
        for(int i=0;i<myCode.length();i++)
        {
            PrintKpc(ros, ans+myCode.charAt(i));
        }

        
        

        


    }
    public static void main(String[] args) {
        String str=scn.next();
        PrintKpc(str,"");
    }
    
}
