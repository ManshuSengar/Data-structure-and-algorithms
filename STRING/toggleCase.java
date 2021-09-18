import java.util.*;
class toggleCase{
    public static Scanner scn =new Scanner(System.in);
    public static String togglecase(String str)
    {
        StringBuilder sb=new StringBuilder();
        sb.append(str);
        int n= sb.length();
        int i=0;
        while(i<n){
        if(sb.charAt(i)>='A' && sb.charAt(i)<='Z'){
            sb.setCharAt(i,(char)(sb.charAt(i)+32));
        }
        else{
             sb.setCharAt(i,(char)(sb.charAt(i)-32));
        }
        i++;
        }
        return sb.toString();
    }
    public static void main(String[] args)
    {
       String str=scn.next();
       String ans= togglecase(str);
       System.out.println(ans);
    }
}