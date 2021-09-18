import java.util.ArrayList;
import java.util.Arrays;

public class targetsumpair {

    public static ArrayList<int[]> targetSum(int[] arr,int tar){
        int i=0;
        int j=arr.length-1;
    
        ArrayList<int[]> ans = new ArrayList<>();
       while(i<j){
           int sum=arr[i]+arr[j];
           if(sum==tar){
            ans.add(new int[]{arr[i++],arr[j--]});
        
           }
           else if(sum>tar){
               j--;
           }
           else{
              i++;  
           }

       }
       
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,-2,5,10,-1,5,9,4,-28};

        // int target=14;
        Arrays.sort(arr);
        for(int e:arr){
            System.out.println(e);
        }
    ArrayList<int[]> ans= targetSum(arr,14);
    System.out.println(ans);
    for(int[] ar: ans){
        
         System.out.println(ar[0] +" "+ ar[1]);
        
    }
        
    }
}
