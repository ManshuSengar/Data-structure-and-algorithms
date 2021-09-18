public class newstring {
   public static void gridStr(String str)
    {
        int l = str.length();
        int k = 0, row, column;
        row = (int) Math.floor(Math.sqrt(l));
        column = (int) Math.ceil(Math.sqrt(l));
 
        if (row * column < l)
        {
            row = column;
        }
 
        char s[][] = new char[row][column];
         
        
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
            {
                if(k < str.length())
                    s[i][j] = str.charAt(k);
                k++;
            }
        }
        // char ans[] 
        // for(int i=0;i<row;i++){

        // }
        StringBuilder ans= new StringBuilder();
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < 1; j++)
            {
                if (s[i][j] == 0)
                {
                    break;
                }
                ans.append(s[i][j]);
                
            }
        }
        System.out.println(ans);
       
        
    }
    public static void main(String[] args) {
        String str = "gangs_of_wasseypur";
        gridStr(str);
    }
}
