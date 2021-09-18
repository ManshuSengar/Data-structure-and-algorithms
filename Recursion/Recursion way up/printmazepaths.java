import java.util.*;

public class printmazepaths {
    public static Scanner scn= new Scanner(System.in);
    public static void printMaze(int sr,int sc,int dr,int dc,String ans){
        if(sr==dr && sc==dc){
            System.out.println(ans);
            return;
        }
        if(sc+1<=dc){
            printMaze(sr, sc+1, dr, dc, ans+"h");
        }
        if(sr+1<=dr){
            printMaze(sr+1, sc, dr, dc, ans+"v");
        }
    }
    
    public static void main(String[] args) {
        int m=scn.nextInt();
        int n=scn.nextInt();
        printMaze(1,1,m,n,"");
    }
    
}
