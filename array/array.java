import java.util.*;

public class array{
    public static Scanner scn= new Scanner(System.in);



    public static void SpanofArray(int [] a)
    {
        int min=a[0];
        int max=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(min>a[i])
            {
                min=a[i];
            }
            if(max<a[i])
            {
                max=a[i];
            }

        }
        System.out.print(max-min);
    }
 public static int maxArray(int [] a)
    {
        
        int max=a[0];
        for(int i=1;i<a.length;i++)
        {
           
            if(max<a[i])
            {
                max=a[i];
            }

        }
        return max;
    }


    public static  int findElementArray(int[]a,int d)
    {
     int findIndex=-1;
     for(int i=0;i<a.length;i++)
     {
        if(a[i]==d)
     {
         findIndex=i;
     }

     }
     return findIndex;
    }

    public static void Barchart(int[]a)
    {
        int max=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        for(int h=max;h>=1;h--)
        {
            for(int i=0;i<a.length;i++)
            {
                if(a[i]>=h)
                {
                    System.out.print("*\t");
                }
                else{
                   System.out.print("\t");  
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args  )
    {
        int n3=0;
      int n1=scn.nextInt();
      int[] arr=new int[n1];
      for(int i=0;i<arr.length;i++)
      {
          arr[i]=scn.nextInt();
      }
    //   int d=scn.nextInt();


    int n2=scn.nextInt();
      int[] arr1=new int[n2];
      for(int i=0;i<arr1.length;i++)
      {
          arr1[i]=scn.nextInt();
      }
      
      if(n1>n2)
      {
          n3=n1+1;
      }
      else{
          n3=n2+1;
      }

      int[] arr2= new int[n3];
      SumofArray(arr,arr1,arr2);
       for(int i=0;i<arr2.length;i++)
      {
          System.out.println(arr2[i]);
      }


    // SpanofArray(arr);
//  int f=   findElementArray(arr,d);
//  System.out.print(f);
    // Barchart(arr); 
    // SumofArray(arr,arr2);
    }


    public static void SumofArray(int[]arr,int[]arr1,int[]arr2)
    {
        int c=0;
     int   n1=arr.length;
       int n2=arr1.length;
        int i=n1;
        int j=n2;
        int k=arr2.length;
        while(i>0 || i>0 || c>0)
        {
            int d=arr[--i]+arr1[--j]+c;
            arr2[--k]=d%10;
            c=d/10;

        }

    }

    var isPalindrome=function(x){
if(x<0) return false;
  let xCOpy =x;
  let ans=0;
  while(x>0){
   let rem=Math.floor(x%10); 
   ans=(ans*10)+rem; 
   x=Math.floor(x/10);
  }
  return xCOpy ==ans;
};
}
