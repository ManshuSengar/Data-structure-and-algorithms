import java.util.*;

public class countsort {
    public static void countSort(int[] arr){
        int maxmium = -(int) 1e9;
        int minimum = (int) 1e9;
        
        for (int e : arr) {
            maxmium = Math.max(maxmium, e);
            minimum=Math.min(minimum, e);
        }
        int range = maxmium - minimum + 1;
        int[] freq = new int[range];
        for (int e : arr) {
            freq[e-minimum]++;
        }
        int i = 0;
        int j = 0;
        while (i<range) {
            if (freq[i] > 0) {
                arr[j++] = i+minimum;
                freq[i]--;
            } else if(i!=range){
                i++;
            }
        }
        for(int e:arr){
            System.out.println(e);
        }

       System.out.println("Next one");
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 10, 6, 1, 4, 8, 4, 1 };
        int[] arr1={-1,2,-10,6,-8,-7,0,1,2,3};
        countSort(arr1);
        // int n = arr.length;
        int maxmium = -(int) 1e9;
        for (int e : arr) {
            maxmium = Math.max(maxmium, e);
        }
        int range = maxmium - 0 + 1;
        int[] freq = new int[range];
        for (int e : arr) {
            freq[e]++;
        }
        int i = 0;
        int j = 0;
        while (i<range) {
            if (freq[i] > 0) {
                arr[j++] = i;
                freq[i]--;
            } else if(i!=range){
                i++;
            }
        }
        for(int e:arr){
            System.out.println(e);
        }


    }
}
