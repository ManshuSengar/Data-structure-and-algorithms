import java.util.*;

class getstairpath{
  public static Scanner scn=new Scanner(System.in);
    public static ArrayList<String>getStair(int n)
    {
       if(n==0)
       {
         ArrayList<String> base= new ArrayList<>();
         base.add("");
         return base;
       }
       ArrayList<String> ans=new ArrayList<>();
       for(int i=1;i<=3 && n-i>=0;i++)
       {
         ArrayList<String> recAns=getStair(n-i);
         for(String s: recAns)
         {
           ans.add(i+s);
         }
         
       }
       return ans;
       

       

    }
    public static void main(String[] args){
      int n =scn.nextInt();
      ArrayList<String> ans= getStair(n);
      System.out.println(ans);
    }
}
