import java.util.*;

class getmazepath{
    public static Scanner scn = new Scanner(System.in);
    public static ArrayList<String> getMaze(int sr,int sc,int dr,int dc){
        if(sr==dr && sc==dc)
        {
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String> ans=new ArrayList<>();
        if(sc+1<=dc)
        {
         ArrayList<String> recAns= getMaze(sr,sc+1,dr,dc);
         for(String s:recAns)
         {
             ans.add("H"+s);
         }
        }
        if(sr+1<=dr)
        {
         ArrayList<String> recAns= getMaze(sr+1,sc,dr,dc);
         for(String s:recAns)
         {
             ans.add("V"+s);
         }
        }
        return ans;
    }
    public static void main(String[] args){
        int sr=scn.nextInt();
        int sc=scn.nextInt();
        int dr=scn.nextInt();
        int dc=scn.nextInt();
        ArrayList<String> ans=getMaze(sr,sc,dr,dc);
        System.out.println(ans);
    }
}