import java.util.*;

public class sort {

    public static void swap(int[] arr, int ptr, int itr) {
        int temp = arr[itr];
        arr[itr] = arr[ptr];
        arr[ptr] = temp;
    }

    public static void sort01(int[] arr) {
        int ptr = -1;
        int itr = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                swap(arr, ++ptr, itr++);
            } else {
                itr++;
            }
        }

    }

    public static void sort012(int[] arr) {
        int n = arr.length, p1 = -1, p2 = n - 1, itr = 0;
        while (itr <= p2) {
            if (arr[itr] == 0)
                swap(arr, itr++, ++p1);
            else if (arr[itr] == 2)
                swap(arr, itr, p2--);
            else
                itr++;

        }
    }

    public static void Bubblesort(int[] arr) {
        int n = arr.length;

        int i = 0;
        while (i < n) {
            int itr = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[itr] > arr[j]) {
                    swap(arr, itr, j);
                }
                itr++;
            }
            n--;

        }
    }

    public static void selectionSort(int[] arr) {
        int i = 0;
        int n = arr.length;
        while (i < n) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }
            i++;
        }
    }

    public static void insertionSort(int[] arr) {
        int i = 0;
        int n = arr.length;
        while (i < n) {
            int itr = i;
            for (int j = i + 1; j > 0 && j < n; j--) {
                if (arr[itr] > arr[j]) {
                    if (itr >= 0) {
                        swap(arr, itr, j);
                        itr--;
                    }

                } else {
                    break;
                }

            }
            i++;

        }
    }

    public static int partionOfArray(int[] arr, int data) {
        int itr = 0;
        int ptr = -1;
        int n = arr.length;
        while (itr <= n - 1) {
            if (arr[itr] <= data) {
                swap(arr, itr++, ++ptr);
            }
            itr++;
        }
        return ptr;
    }

    public static int partionOfArrayOnIndex(int[] arr,int pivot){
        int n=arr.length;
        swap(arr,n-1,pivot);
        int itr=0;
        int ptr=-1;
        while(itr<n-1){
            if(arr[itr]<=arr[pivot]){
                swap(arr,itr++,++ptr);
            }
            itr++;
        }
        swap(arr,++ptr,n-1);

      return ptr;
    }
    public static void display(int[] arr){
        for (int el : arr) {
            System.out.print(el + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 1, 0, 0, 2, 1 };
        int[] arr1 = { 2, 9, 5, 1, 3,-1,56,3,-10,5 };
        // sort01(arr);
        // sort012(arr);
        // Bubblesort(arr1);
        // selectionSort(arr1);
        insertionSort(arr1);
       ;
      System.out.println( partionOfArrayOnIndex(arr1,3)); 
      display(arr1);
      System.out.println( partionOfArray(arr1,-1)); 
      display(arr1);

       
    }

}
