import java.util.*;


public class quicksort {

    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int partion(int[] arr,int si,int ei,int pidx){
    swap(arr,ei,pidx);
     int itr=si;
     int ptr=si-1;
     while(itr<=ei-1){
         if(arr[itr]<=arr[ei]){
             swap(arr,++ptr,itr);
         itr++;    
         }
     }
     swap(arr, ++ptr, ei);
     return ptr;
    }

    public static void quickSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
       int pidx=ei;
      int p= partion(arr, si, ei, pidx);
      quickSort(arr, si, p-1);
      quickSort(arr, p+1,ei);
    }
    public static void display(int[] arr){
        for (int el : arr) {
            System.out.print(el + " ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int[] arr={2,-10,78,-1,1,4,-8,67};
        int ei=arr.length-1;
        quickSort(arr, 0, ei);
        display(arr);

    }
    
}
