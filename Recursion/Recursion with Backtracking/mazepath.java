import java.util.*;


public class mazepath {
   


    public static Scanner scn = new Scanner(System.in);
    public static int mazePath(int sc,int sr,int er,int ec,String ans,int dirs[][], String dir[]){
        if(sr==er && sc==ec){
            System.out.println(ans);
            return 1;
        }
        int count=0;
    
        for(int i=0;i<dirs.length;i++){
            int c=sc+dirs[i][0];
            int r=sr+dirs[i][1];
            if(c>=0 && r>=0 && c<=ec && r<=er)
            {
                count+=mazePath(c, r, er, ec, ans + dir[i], dirs, dir);
            }
           
        }


        return count;
    }
    public static void main(String[] args) {

       int[][] dirs={{0,1},{1,1},{1,0}};
       String [] dir={"h","d","v"};
     System.out.println(mazePath(0, 0,2,2,"", dirs, dir));  
    }

}
