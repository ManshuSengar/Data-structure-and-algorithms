import java.util.*;
class subsequence1 {
    // public static Scanner scn= new Scanner(System.in);
    public static ArrayList<String> subSeq(String str){
        if(str.length()== 0){
            ArrayList<String> base= new ArrayList<>();
            base.add("");
            return base;
        }
        char ch=str.charAt(0);
        ArrayList<String> recSeq= subSeq(str.substring(1));
        // ArrayList<String> ans= new ArrayList<>(recSeq); // through constructor 
        ArrayList<String> ans= new ArrayList<>();
        for(String s:recSeq)
        {
            ans.add(s);
            ans.add(ch+s);
        }

        return ans;

    }
    public static void main(String[] args)
    {
      
        System.out.println( subSeq("abcd"));
    }
}