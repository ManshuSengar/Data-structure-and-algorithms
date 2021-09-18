import java.util.*;
class subsequence{
    public static Scanner scn= new Scanner(System.in);
    public static ArrayList<String> subSeq(ArrayList<String> str){
        if(str.length()== 0){
            ArrayList<String> base= new ArrayList<>();
            base.add("");
            return base;
        }
        char ch=str.charAt(0);
        ArrayList<String> recSeq= subSeq(str.subString(1));
        // ArrayList<String> ans= new ArrayList<>(recSeq); // through constructor 
        ArrayList<String> ans= new ArrayList<>();
        for(int s:recSeq)
        {
            ans.add(s);
            ans.add(s+ch);
        }

        return ans;

    }
    public static void main(String[] args)
    {
        ArrayList<String> = subSeq("abcd")
    }
}