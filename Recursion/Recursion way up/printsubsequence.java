import java.util.*;

public class printsubsequence {
    public static Scanner scn= new Scanner(System.in);
    public static void Subseq(String str,String ans)
    {
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        char ch=str.charAt(0);
        String ros=str.substring(1);
        Subseq(ros, ans+ch);
        Subseq(ros, ans);
    }
    public static void main(String[] args) {
        String str=scn.next();
        Subseq(str,"");

    }
    
}
