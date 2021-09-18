// import java.util.*;

// public class l001{
//      public static void printz() {
//         // Write your code here
//         System.out.println("*****");
//         System.out.println("   *");
//         System.out.println("  *");
//         System.out.println(" *");
//         System.out.println("*****");
//     }
//     public static void main(String[] args)
//     {
//         printz();
//     }
// }

// import java.util.*;
  
//   public class l001{ 
//     public static Scanner scn= new Scanner(System.in);
//     public static void grading()
//    {
//        int marks = scn.nextInt();
//        if(marks>90)
//        {
//            System.out.println("excellent");
//        }
//        else if(marks>80 && marks<=90)
//        {
//            System.out.println("good");
//        }
//         else if(marks>70 && marks<=80)
//        {
//            System.out.println("fair");
//        }
//         else if(marks>60 && marks<=70)
//        {
//            System.out.println("meet exceptions");
//        }
//        else if(marks<=60)
//        {
//            System.out.println("below par");
//        }
//    }
//    public static void main(String[] args)
//    {
//       grading();
//    }
  
// }
  
// import java.util.*;

// public class l001{ 
//     public static Scanner scn= new Scanner(System.in);

//     public static void Table(int num,int i)
//     {
//         System.out.println(num*i);

//     }
//     public static void main(String[] args)
//     {
//         int num =scn.nextInt();
//         for(int i=1;i<=10;i++)
//         {
//             Table(num,i);
//         }
//     }

// }

import java.util.*;

public class l001{
  public static Scanner scn= new Scanner(System.in);

  public static void PrintTable(int num)
  {
      int multiply=0;
      for(int i=1;i<=10;i++)
      {
        multiply=num*i;
        System.out.println(num+" X " + i+ "=" + multiply);
      }
  }
  public static void PrintAllTable(int num)
  {
    for(int i=1;i<=num;i++)
    {
      PrintTable(i);
      System.out.println();
    }
  }

  
  public static void main(String[] args)
  {
      int num = scn.nextInt();
          PrintAllTable(num);
  }
  }



  