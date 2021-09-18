import java.util.*;
class getkpc{
    public static Scanner scn= new Scanner(System.in);
    public static String[] nokiakp= {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static ArrayList<String> getKpc(String getAns)
    {
        if(getAns.length()== 0){
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;
        }
        String code=nokiakp[getAns.charAt(0)-'0'];
        ArrayList<String> recAns= getKpc(getAns.substring(1));
        ArrayList<String> ans=new ArrayList<>();
        for(int i=0;i<code.length();i++)
        {
        for(String s : recAns)
        {
            ans.add(code.charAt(i)+s);
        }
        }
        return ans;

    }
    public static void main(String[] args)
    {
    String getAns =scn.next();
    System.out.println(getKpc(getAns));
    }
}