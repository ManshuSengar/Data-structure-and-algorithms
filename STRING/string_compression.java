
import java.util.*;

class string_compression{

    public static Scanner scn= new Scanner(System.in);
    public static void removeDuplicates(String str)
    {
        String ans= str.charAt(0)+"";
        int n= str.length();
        int i=1;
        while(i<n)
        { 
            while(i<n && ans.charAt(ans.length()-1) == str.charAt(i))
            {
                i++;
            
            }
           
            if(i<n)
            {
                ans+=str.charAt(i);
                i++;
            }
        }
        System.out.println(ans);
    }
    public static void stringCompression(String str)
    {
        String ans= str.charAt(0)+"";
        int n= str.length();
        int i=1;
        int count=0;
        while(i<n)
        {
            count=1;
            while(i<n && ans.charAt(ans.length()-1) == str.charAt(i))
            {
                i++;
                count++;
            }
            if(count>1){
                ans+=count;
            }
            if(i<n)
            {
                ans+=str.charAt(i);
                i++;
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        String str= scn.next();
        removeDuplicates(str);
        stringCompression(str);
      }
    
}
