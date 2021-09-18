import java.util.*;

// import javax.swing.text.html.HTMLDocument.BlockElement;

class arrayq {
    public static Scanner scn = new Scanner(System.in);

    public static void input(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
    }

    public static void display(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        input(arr);
        // int data=scn.nextInt();
        // display(arr);
        // int max=maximum(arr);
        // int min=minimum(arr);
        // int findIndex=findindex(arr,data);
         int r=scn.nextInt();
        // rotateArray(arr);
        // display(arr);
        // display(arr);
        // Reverseanarray(arr);
        // inverseOfArray(arr);
        //  int r = scn.nextInt();
        // rotateArray(arr, r);
        // rotateArray1(arr, r);
        // int[] b = new int[r];
        // input(b);
        // subtraction(arr, b);
       
        // subArray(arr);
        System.out.println(binarySearch(arr, r));

    }

    public static int maximum(int[] arr) {
        int max = -(int) 1e9;
        for (int ele : arr) {
            max = Math.max(ele, max);
        }
        return max;
    }

    public static int minimum(int[] arr) {
        int min = (int) 1e9;
        for (int ele : arr) {
            min = Math.min(min, ele);
        }
        return min;
    }

    public static int findindex(int[] a, int data) {

        for (int i = 0; i < a.length; i++) {
            if (a[i] == data) {
                return i;
            }
        }
        return -1;
    }

    public static void swap(int[] a, int i, int j) {

        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void Reverseanarray(int[] a) {
        int i = 0;
        int j = a.length - 1;
        while (i < j) {
            swap(a, i, j);
            i++;
            j--;
        }
    }

    public static void inverseOfArray(int[] a) {
        int n = a.length;
        int[] b = new int[n];

        for (int i = 0; i < a.length; i++) {
            int idx = a[i];
            b[idx - 1] = idx;
        }
        display(b);
    }

    public static void rotateArray(int[] a, int r) {
        int n = a.length;
        r %= n;
        int[] b = new int[n];
        if (r < 0) {
            r = r + n;
        }
        for (int i = 0; i < n; i++) {
            int idx = (i + r) % n;
            b[idx] = a[i];
        }
        display(b);

    }

    public static void rotateArray1(int[] a, int r) {
        int n = a.length;
        // Reverseanarray(a,0,n-1);
        // Reverseanarray(a, 0, r-1);
        // Reverseanarray(a, r,n-1 );
        display(a);
    }

    // public static void sumOfarray(int[] a, int b[]) {
    // int[] n = new int[a.length >= b.length ? a.length + 1 : b.length + 1];
    // int l = 0;
    // int k = (a.length >= b.length) ? b.length : a.length;
    // int len = (a.length >= b.length) ? a.length : b.length;
    // int diff = len - k;
    // int de = 0;
    // int[] c = new int[len];
    // for (int i = 0; i < diff; i++) {
    // c[i] = 0;
    // }
    // for (int i = diff; i < len; i++) {
    // c[i] = b[de++];
    // }
    // for (int i = len - 1; i >= 0; i--) {
    // int s = a[i] + c[i];
    // if (s > 9) {
    // n[l++] = s - 10;
    // if (i > 0)
    // a[i - 1]++;
    // if ((i) == 0)
    // n[l++] = 1;
    // } else {

    // n[l++] = s;
    // }
    // }
    // Reverseanarray(n);
    // display(n);

    // }

    // public static void sumOfarray(int[] a, int[] b) {
    //     int i = a.length;
    //     int j = b.length;
    //     int k = i >= j ? i + 1 : j + 1;
    //     i = i - 1;
    //     j = j - 1;
    //     int[] sum = new int[k];
    //     k = k - 1;

    //     int carry = 0;
    //     int d = 0;
    //     while (k >= 0) {
    //         d = carry + (i >= 0 ? a[i] : 0) + (j >= 0 ? b[j] : 0);
    //         sum[k] = d % 10;
    //         carry = d / 10;
    //         k--;
    //         i--;
    //         j--;
    //     }

    //     display(sum);

    // }

public static void subtraction(int[] n2,int[] n1)
{
    int borrow=0;
    int i=n2.length-1;
    int j=n1.length-1;
    int s=0;
    int  k=n2.length;
    int[] sub=new int[k];
    k=k-1;
    while(k>0)
    {
        s=borrow+(i>=0?n2[i]:0)-(j>=0?n1[j]:0);
        borrow=s<0?-1:0;
        sub[k]=s>0?s:s+10;
        i--;j--;k--;   
    }
    display(sub);
}

public static void printRange(int[] a,int si ,int ei)
{
    while(si<=ei)
    {
        System.out.print(a[si] + " ");
        si++;
    }
    
}

public static void subArray(int[] a){
    for(int i=0;i<a.length;i++)
    {
      for(int j=i;j<a.length;j++)
      {
          printRange(a, i, j);
      }
    }
  
}

public static int binarySearch(int[] a,int data)
{
    int si=0;int ei=a.length-1;
   
    while(si<=ei)
    {
    int mid=(si+ei)/2;
     if(a[mid]==data){
         return mid;
     }
     else if(a[mid]<data){
         ei=mid-1;

     }
     else{
         si=mid+1;
     }
    }
    return -1;
}
public static int FirstindexLast(int[] a,int data)
{
    int si=0;int ei=a.length-1;
   
    while(si<=ei)
    {
    int mid=(si+ei)/2;
     if(a[mid]==data){
         
     }
     else if(a[mid]<data){
         ei=mid-1;

     }
     else{
         si=mid+1;
     }
    }
    return -1;
}

}
