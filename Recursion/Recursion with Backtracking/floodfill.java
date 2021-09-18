import java.util.*;

class floodfill{
    public static int FloodFill8(int sc,int sr,int[][] board,int[][] dir,String[] dirs,String ans){
        if(sr==board.length-1 && sc==board[0].length-1){
            System.out.println(ans);
            return 1;
        }
        board[sr][sc]=1;
        int  count=0;
        for(int i=0;i<dir.length;i++){
          int  r=sr+dir[i][0];
          int c=sc+dir[i][1];
        if(r<board.length && r>=0 && c>=0 && c<board[0].length && board[r][c]==0){
            count+= FloodFill(c, r, board, dir, dirs, ans+dirs[i]);
        }
         
        }

       board[sr][sc]=0;
       
        return count;
    }

    public static int FloodFill(int sc,int sr,int[][] board,int[][] dir,String[] dirs,String ans){
        if(sr==board.length-1 && sc==board[0].length-1){
            System.out.println(ans);
            return 1;
        }
        board[sr][sc]=1;
        int  count=0;
        for(int i=0;i<dir.length;i++){
          int  r=sr+dir[i][0];
          int c=sc+dir[i][1];
        if(r<board.length && r>=0 && c>=0 && c<board[0].length && board[r][c]==0){
            count+= FloodFill(c, r, board, dir, dirs, ans+dirs[i]);
        }
         
        }

       board[sr][sc]=0;
       
        return count;
    }
    public static void main(String[] args) {
        int[][] dir={{0,1},{1,0},{-1,0},{0,-1}};
        String[] dirs={"r","d","u","d"};
        int[][] dir8={{0,1},{1,0},{-1,0},{0,-1},{1,1},{-1,-1},{-1,1},{1,-1}};
        String[] dirs8={"r","d","u","l","s","w","e","n"};
        int[][] board8= {{0,0,0},{1,0,1},{0,0,0}};
        // System.out.println(FloodFill(0,0,board,dir,dirs,""));
        System.out.println(FloodFill8(0,0,board8,dir8,dirs8,""));
        
    }


}


        // flood fill with 8 direction ***********************************************************************************************************************************



    
    
