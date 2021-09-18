import java.util.*;
public class pattern1{
public static Scanner scn= new Scanner(System.in);
//  public static void traingle(int n)
//  {
//      int nst=1;
     
//      for(int row=1;row<=n;row++)
//      {
//          for(int cst=1;cst<=nst;cst++ )
//          {
//             System.out.print("*\t");
//          }
//         nst++;
//         System.out.println();

//      }
//  }



//  public static void invertTraingle(int n)
//  {
//      int nst=n;
     
//      for(int row=1;row<=n;row++)
//      {
//          for(int cst=1;cst<=nst;cst++ )
//          {
//             System.out.print("*\t");
//          }
//         nst--;
//         System.out.println();

//      }
//  }
//  public static void revertTraingle(int n)
//  {
//     int nsp=n-1;
//     int nst = 1;
//     for(int row=1;row<=n;row++)
//     {
//         for(int csp=1;csp<=nsp;csp++)
//         {
//             System.out.print("\t");
//         }
//          for(int cst=1;cst<=nst;cst++)
//         {
//             System.out.print("*\t");
//         }
//         nsp--;
//         nst++;
//         System.out.println();
//     }

//  }

//   public static void invert1(int n)
//  {
//      int nst=n;
//      int nsp=0;
//      for(int row=1;row<=n;row++)
//      {
//          for(int csp=1;csp<=nsp;csp++)
//          {
//               System.out.print("\t");
//          }
//          for(int cst=1;cst<=nst;cst++)
//          {
//             System.out.print("*\t");

//          }
//          nst--;
//          nsp++;
//          System.out.println();
//      }
//  }
 public static void fullStar(int n)
 {
     int nst=1;
     int nsp=n/2;
     for(int row=1;row<=n;row++)
     {
        for(int csp=1;csp<=nsp;csp++)
            System.out.print("\t");
        for(int cst=1;cst<=nst;cst++)
            System.out.print("*\t");   

        if(row<=n/2)
        {
            nst+=2;
            nsp--;
        }
        else{
            nst-=2;
            nsp++;
        }
        System.out.println();
           
     }
 }

 public static void Backwardslash(int n)
 {
     for(int i=1;i<=n;i++)
     {
        for(int j=1;j<=n;j++)
         {
            if(j==i)
            System.out.print("*\t");
            else{
                System.out.print("\t");
            }
         }
         System.out.println();
     }
 }
public static void Forwardslash(int n)
 {
     for(int i=1;i<=n;i++)
     {
        for(int j=1;j<=n;j++)
         {
            if(j+i==n)
            System.out.print("*\t");
            else{
                System.out.print("\t");
            }
         }
         System.out.println();
     }
 }
public static void fullNumberStar(int n)
 {
     int nst=1;
     int nsp=n/2;
     int val=1;
     for(int row=1;row<=n;row++)
     {
        
        for(int csp=1;csp<=nsp;csp++)
            System.out.print("\t");
        for(int cst=1;cst<=nst;cst++)
        {

            System.out.print(val+"\t");
            if(cst<=nst/2)
            {
                val++;
            }
            else{
                val--;
            }
        }

        if(row<=n/2)
        {
            nst+=2;
            nsp--;
            val=row+1;
        }
        else{
            nst-=2;
            nsp++;
            val=n-row;
        }
        System.out.println();
           
     }
 }

public static void Bothslash(int n)
 {
     for(int i=1;i<=n;i++)
     {
        for(int j=1;j<=n;j++)
         {
            if(j+i==n+1||i==j)
            System.out.print("*\t");
            else{
                System.out.print("\t");
            }
         }
         System.out.println();
     }
 }
 public static void pattern10(int n)
 {
     int nspo=n/2;
     int nspi=-1;
     for(int row=1;row<=n;row++)
     {
         for(int cspo=1;cspo<=nspo;cspo++)
         {
            System.out.print("\t");
         }
        System.out.print("*\t");
        for(int cspi=1;cspi<=nspi;cspi++)
         {
            System.out.print("\t");
         }
         if(nspi!=-1)
         {
             System.out.print("*\t");
         }

         if(row<=n/2)
         {
             nspo--;
             nspi+=2;

         }
         else{
             nspo++;
             nspi-=2;
         }
       System.out.println();
     }
 }

 public static void pattern11(int n)
 {
     int nst=1;
     int val=1;
     for(int row=1;row<=n;row++)
     {
         for(int cst=1;cst<=nst;cst++)
        {
            System.out.print(val++ + "\t");
        }
       nst++;
      System.out.println();
     }
 }
 public static void pattern12(int n)
 {
     int a=0;
     int b=1;
     int nst=1;
     for(int row=1;row<=n;row++)
     {
         for(int cst=1;cst<=nst;cst++)
        {
            System.out.print(a+"\t");
            int sum=a+b;
            a=b;
            b=sum;
        }
        nst++;
        System.out.println();
     }
 }
 public static void pattern13(int x)
 {
     int c=1;
     int c1=0;
     int nst=1;
     int n=0;
     int r=0;
     for(int row=1;row<=x;row++)
     {
         for(int csp=0;csp<nst;csp++)
         {
             System.out.print(c + "\t");
             c1=((n-r)*c)/(r+1);
             c=c1;
             r++;
         }
         nst++;
         n=row;
         r=0;
         c=1;
         System.out.println();
     }
 }


public static void pattern16(int n)
{
    int nsp=n+1;
    int val=1;
    int nst=1;
    for(int row=1;row<=n;row++)
    {
        for(int cst=1;cst<=nst;cst++)
        {
            System.out.print(val++ + "\t");
            
        }
        if(row==n)
        {
            val--;
            nst--;
        }
        for(int csp=1;csp<=nsp;csp++)
        {
            System.out.print("\t");

        }
        for(int cst=1;cst<=nst;cst++)
        {
            System.out.print(--val + "\t");
            
        }
        
        nst++;
        nsp-=2;
        System.out.println();
    }

    public static void pattern17(int n)
    {
        
    }
}
public static void main(String[] args)
{
    int n=scn.nextInt();
    // traingle(n);
    // invertTraingle(n);
    // revertTraingle(n);
    // invert1(n);
    // fullStar(n);
    // fullNumberStar(n);
    // Backwardslash(n);
    // Forwardslash(n);
    //  Bothslash(n);
    // pattern16(n);
    pattern17(n);
}
}