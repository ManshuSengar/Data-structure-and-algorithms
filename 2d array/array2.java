import java.util.*;



import javax.lang.model.util.ElementScanner14;

public class array2 {
    public static Scanner scn = new Scanner(System.in);

    public static void input(int[][] arr) {
        int n = arr.length; // no of row
        int m = arr[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

    }

    public static void display(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int maximum(int[][] arr) {
        int max = -(int) 1e9;
        int n = arr.length;
        int m = arr[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                max = Math.max(arr[i][j], max);

            }
        }
        return max;
    }

    public static int minimum(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int min = (int) 1e9;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                min = Math.min(arr[i][j], min);
            }
        }
        return min;
    }

    public static boolean findElement(int[][] arr, int data) {
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (data == arr[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void display2(int[][] arr) {
        for (int[] ar : arr) {
            for (int a : ar) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }

    public static void spiralPrint(int[][] arr)
     {
         int n=arr.length;
         int m=arr[0].length;
         for(int j=0;j<m;j++)
         {
             if(j%2==0)
             {
                for(int i=0;i<n;i++)
                {
                 System.out.print(arr[i][j] + " ");
                }
             }
             else{
                for(int i=n-1;i>=0;i--)
                {
                 System.out.print(arr[i][j]);
                }
             }
            System.out.println();

         }
        }

    public static void spiralPrintReverse(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    System.out.print(arr[i][j] +" ");
                }
            } else {
                for (int j = m-1; j >= 0; j--) {
                    System.out.print(arr[i][j]);
                }
            }
            System.out.println();

        }
        
    }
    public static void diagonalPrint(int[][] arr)
    {
        int n=arr.length;
        int m=arr[0].length;
        for(int gap=0;gap<m;gap++) //important hai yaad rakhna 
        {
            for( int i=0,j=gap;i<n && j<m ;i++,j++)  // naya loop dekh le acche se 
            {
                System.out.println(arr[i][j]);
            }
        }
    }


    public static void spiralRound(int[][] arr)
    {
        int n = arr.length;
        int m= arr[0].length;
        int rmin=0,rmax=n-1,cmin=0,cmax=m-1;
         int totaln=n*m;
         while(totaln>0)
         {
            for(int i=cmin;i<=cmax && totaln>0;i++)
            {
                System.out.println(arr[rmin][i]);
                totaln--;
            }
            rmin++;
            for(int i=rmin;i<=rmax  && totaln>0;i++){
                System.out.println(arr[i][cmax]);
                totaln--;
            }
            cmax--;
            for(int i=cmax;i>=cmin  && totaln>0;i--){
                System.out.println(arr[rmax][i]);
                totaln--;
            }
            rmax--;
            for(int i=rmax;i>=rmin  && totaln>0;i--)
            {
                System.out.println(arr[i][cmin]);
                totaln--;
            }
            cmin++;
         }
    }



    public static void exitPoint(int[][] arr)
    {
        int n=arr.length;
        int m=arr[0].length;
        int i=0,j=0;
        int dir=0;
        while(true)
        {
            dir=(dir +arr[i][j])%4;
            if(dir==0)
            {
                j++;
                if(j==n){
                    System.out.println(i + " "+ (j-1));
                    break;
                }
            }
            else if(dir==1)
            {
                i++;
                if(i==m){
                    System.out.println((i-1) + " "+j);
                    break;
                }
            }
            else if(dir==2)
            {
                j--;
                if(j==-1){
                    System.out.println(i + " "+(j+1));
                    break;
                }
            }
            else if(dir==3)
            {
                i--;
                if(i==-1){
                    System.out.println((i+1) + " "+j);
                    break;
                }
            }

        }
    }

    public static void saddlePoint(int[][] arr)
    {
        int c=0,r=0;
        int min=99999999;
        int max= -min;

        int n=arr.length;
        int m=arr[0].length;
        System.out.println(m);
        System.out.println(n);
        while(c<m && r<n)
        {
            for(int j=0;j<m;j++){
                if(arr[r][j]<min)
                {
                    min=arr[r][j];
                }
            }
          
            for(int i=0;i<n;i++)
            {
                if(arr[i][c]>max)
                {
                    max=arr[i][c];
                }
            }
            System.out.println(max + " " + min);
            
           r++;
           c++;
            if(max==min)
            {
                System.out.print(max);
                return;
            }
             min=99999999;
             max= -min;
            
        }

        System.out.print("Invalid input");
    }

    public static void main(String[] args) {
        int[][] arr = new int[scn.nextInt()][scn.nextInt()];
        input(arr);
      //  display2(arr);
        // spiralPrint(arr);
        // spiralPrintReverse(arr);
        // diagonalPrint(arr);

        // int data=scn.nextInt();
        // display(arr);
        // int min= minimum(arr);
        // int max= maximum(arr);
        //    spiralRound(arr);
        // findElement(arr, data);
        // exitPoint(arr);
        saddlePoint(arr);
        // System.out.println(min +" " + max+" "+ findElement(arr, data));
    }
}
