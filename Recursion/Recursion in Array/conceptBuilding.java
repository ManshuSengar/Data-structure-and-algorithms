// import java.util.*;
// class conceptBuilding{
//     public static void printArray(int[] arr,int n){
//           if(n==arr.length)
//             return;
//           System.out.println(arr[n]);
//           printArray(arr,n+1) ;
//     }
//     public static void reverseArray(int[] arr,int n){
//         if(n==arr.length)
//         {
//             return;
//         }
//         // reverseArray(arr,n+1);
//         System.out.println(arr[n]);

//     }
//     public static int maximum(int[] arr,int idx){
//         if(idx==arr.length)
//            return -(int)1e9;
//         int recMax=maximum(arr,idx+1);
//           return Math.max(arr[idx],recMax) ;
//     }
//     public static int minimum(int[] arr,int idx){
//         if(idx==arr.length)
//            return (int)1e9;
//         int recMax=minimum(arr,idx+1);
//           return Math.min(arr[idx],recMax) ;
//     }

//     public static boolean findData(int[] arr,int idx,int data){
//         if(idx==arr.length)
//           return false;
//         boolean answer=findData(arr,idx+1,data) ;
//          if(!answer)
//            return (arr[idx]==data )?true:false;
//         return answer;  
//     }
//     public static boolean findData1(int[] arr,int idx,int data){
//         if(idx==arr.length)
//           return false;
//         if(arr[idx]==data)
//         return true;  
//         return findData1(arr,idx+1,data);
        
//     }
//     public static int firstIdx(int[] arr,int idx,int data )
//     {
//         if(arr.length==idx)
//            return -1;
//         if(arr[idx]==data)
//           return idx;
//         return firstIdx(arr,idx+1,data);     
//     }
//     public static int lastIdx(int[] arr,int idx,int data )
//     {
//         if(arr.length==idx)
//            return -1;
//        int ansIdx= lastIdx(arr,idx+1,data); 
//         if(ansIdx==-1)  {
//             if(arr[idx]==data);
//                 return idx; }
//         return ansIdx;  
//     }
//     public static int[] allIndex(int[] arr,int idx,int data,int i){
//         if(arr.length==idx)
//            return new ans[i];
//         if(arr[idx]==data)
//         { int is=idx;
//           i++;
//         } 
//         int[] ans= allIndex(arr,idx+1,data,i);
//     }

     
//     public static void main(String[] args){
//         int[] arr ={87,-1 ,784,92,45,282,22,22,45};
//         // int n=arr.length;
//         // printArray(arr,0);
//         // reverseArray(arr,0);
//         // System.out.println(maximum(arr,0));
//         // System.out.println(minimum(arr,0));
//         // System.out.println(findData(arr,0,-8393));
//         System.out.println(lastIdx(arr,0,45));
//         System.out.println(firstIdx(arr,0,45));
//         System.out.println(allIndex(arr,0,45,0));
        
//     }
// }