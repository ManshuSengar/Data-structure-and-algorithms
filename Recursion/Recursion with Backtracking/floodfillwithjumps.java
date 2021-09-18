import java.util.*;
public class floodfillwithjumps {



        public static int FloodFill(int sc,int sr,int[][] board,int[][] dir,String[] dirs,String ans){
        int n=board.length-1;
         int m=board[0].length-1;
        if(sr==n && sc==m){
            System.out.println(ans);
            return 1;
        }
        board[sr][sc]=1;
        int  count=0;

        for(int i=0;i<dir.length;i++){
            for(int rad=1;rad<=4;rad++){
                int  r=sr+rad*dir[i][0];
                int c=sc+rad*dir[i][1];
              if(r<n && r>=0 && c>=0 && c<m )
              {
                  if(board[r][c]==0){
                    count+= FloodFill(c, r, board, dir, dirs, ans+dirs[i]+rad);
                  }    
              }
              else{
                  break;
              }
              
               
            }
        }

       board[sr][sc]=0;
       
        return count;
    }


    public static void main(String[] args) {
        int[][] dir={{0,1},{1,0},{-1,0},{0,-1}};
        String[] dirs={"r","d","u","l"};
        // int[][] dir8={{0,1},{1,0},{-1,0},{0,-1},{1,1},{-1,-1},{-1,1},{1,-1}};
        // String[] dirs8={"r","d","u","l","s","w","e","n"};
        int[][] board= {{0,0,0},{0,0,0},{0,0,0}};
        System.out.println(FloodFill(0,0,board,dir,dirs,""));
        // System.out.println(FloodFill8(0,0,board8,dir8,dirs8,""));
        
    }
    
}
