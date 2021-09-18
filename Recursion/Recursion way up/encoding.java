import java.util.*;
// import java.util.Base64.Decoder;

public class encoding {
    public static Scanner scn =new Scanner(System.in);
    public static int deCode(String str,String ans){
        if(str.length()==0)
        {
            System.out.println(ans);
            return 1;
        }
      
        int count=0;
        char ch=str.charAt(0);
        if(ch=='0') return 0;
        count+= deCode(str.substring(1), ans+(char)('a'+ch-'1'));
       
        if(str.length()>1){
              int num = (ch-'0')*10+(str.charAt(1)-'0');
              if(num<=26){
                  count+= deCode(str.substring(2), ans+(char)(num-1+'a'));
              }
          
        }
        return count;

    }
    public static void main(String[] args) {
        String str=scn.next();
       int c= deCode(str, "");
       System.out.println(c);
    }
    
}
