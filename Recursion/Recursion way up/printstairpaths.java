import java.util.*;

public class printstairpaths {

    public static Scanner scn= new Scanner(System.in);
    public static void printStair(int num,String ans){
        if(num==0){
            System.out.println(ans);
            return;
        }
        for(int i=1;i<=3 && num-i>=0;i++ )
        {
            printStair(num-i, ans+i);
        }
    }
    public static void main(String[] args) {
        int num=scn.nextInt();
        printStair(num,"");
    }
    
}
