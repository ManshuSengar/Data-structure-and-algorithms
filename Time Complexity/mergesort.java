public class mergesort {
    public static void merge(int[] arr,int si,int ei){
       int mid=(si+ei)/2;
       int k=si;
       int j=mid+1;
       int i=si;
       while(k<=ei && i<=mid && j<=ei){
         if(arr[i]<=arr[j]){
             arr[k]=arr[i];
             k++;
             i++;
         }  
         else{
             arr[k]=arr[j];
             j++;
             k++;
         }
        }
        while(j<=ei){
            arr[k]=arr[j];
            j++;
            k++;
        }
        while(i<=ei){
            arr[k]=arr[j];
            i++;
            k++;
        }
    }

    public static void mergeSort(int[] arr,int si,int ei){
        int n=si-ei;
        if(n==0) return ;
        int mid=(si+ei)/2;
        merge(arr, si, ei);
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
    }
}

