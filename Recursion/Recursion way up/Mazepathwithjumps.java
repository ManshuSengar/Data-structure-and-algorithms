import java.util.*;

public class Mazepathwithjumps {
    public static Scanner scn= new Scanner(System.in);
    public static void printMaze(int sr,int sc,int dr,int dc,String ans){
        if(sr==dr && sc==dc){
            System.out.println(ans);
            return;
        }
        
            for(int i=1;i<dc && sc+1<=dc;i++)
            printMaze(sr, sc+1, dr, dc, ans+"h"+i);

        
            for(int i=1;i<dr && sr+1<=dr;i++)
            {
                printMaze(sr+1, sc, dr, dc, ans+"v"+i);
            }
            for(int i=1;i<dr && sr+1<=dr && sc+1<=dc;i++)
            {
                printMaze(sr+1, sc+1, dr, dc, ans+"d"+i);
            }
            
    
    }
    
    public static void main(String[] args) {
        int m=scn.nextInt();
        int n=scn.nextInt();
        printMaze(1,1,m,n,"");
    }
    
}
