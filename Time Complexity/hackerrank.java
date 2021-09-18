import java.util.ArrayList;
import java.util.List;

public class hackerrank {
    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        int maximum=-(int)1e9;
        
        for(int e:arr){
           maximum=Math.max(maximum,e); 
        }
        int range=maximum-0+1;
        System.out.println(maximum +"maximum");
        int[] freq=new int[range];
        for(int e: arr){
            freq[e]++;
        }
        List<Integer> freq1= new ArrayList<>();
        for(int e:freq){
            freq1.add(e);
        }
        return freq1;
        }
    
    
    public static void main(String[] args) {
        List<Integer> arr= new ArrayList<>();
        int[] arr1={ 1, 3, 2, 10, 6, 1, 4, 8, 4, 1 };
        for(int e:arr1){
            arr.add(e);
        }
       System.out.println(countingSort(arr)); 

    }
    
}
