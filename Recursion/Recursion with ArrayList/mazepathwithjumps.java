import java.util.*;
class mazepathwithjumps{
    public static Scanner scn= new Scanner(System.in);
    public static ArrayList<String> getMazeJumps(int sr,int sc,int dr,int dc){
        if(sr==dr && sc==dc){
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String> ans= new ArrayList<>();

        for(int i=1;i<=dc && sc+1<=dc;i++)
        {
        ArrayList<String> recAns= getMazeJumps(sr,sc+1,dr,dc);
        for(String s: recAns){
          ans.add("H"+i+s);
        }
        
        }
        for(int i=1;i<=dr && sr+1<=dr;i++)
        {
        ArrayList<String> recAns= getMazeJumps(sr+1,sc,dr,dc);
        for(String s: recAns){
          ans.add("V"+i+s);
        }
        }
        for(int i=1;i<=dr && sr+1<=dr && sc+1<=dc;i++)
        {
        ArrayList<String> recAns= getMazeJumps(sr+1,sc+1,dr,dc);
        for(String s: recAns){
          ans.add("D"+i+s);
        }
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int sr=scn.nextInt();
        int sc=scn.nextInt();
        int dr=scn.nextInt();
        int dc=scn.nextInt();
        ArrayList<String> ans=getMazeJumps(sr,sc,dr,dc);
        System.out.println(ans);
    }
}