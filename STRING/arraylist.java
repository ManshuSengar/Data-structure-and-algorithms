import java.util.*;

class arraylist{
    public static Scanner scn = new Scanner(System.in);
    
        public static void swap(ArrayList<Integer> arr ,int i,int j)
        {
            int temp=arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
        }

    public static void removeData(){

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<10;i++)
        {
            int a= scn.nextInt();
            arr.add(a);
        }
        int data =scn.nextInt();

        int i =arr.size()-1;
        while(i>=0)
        {
            if(arr.get(i)==data)
            {
                swap(arr,i,arr.size()-1);
                arr.remove(arr.size()-1);
            }
            i--;
        }
        System.out.println(arr);
    }

    public static boolean isPrime(int n)
    { int j=2;
        while(j*j<=n))
        {
           
          if(n%j==0)
            return false;
        j++;  
        }
        return true;
    }
    

    public static ArrayList<Integer> removePrimes(ArrayList<Integer> arr )
    {
        ArrayList<Integer> newArr= new ArrayList<>(); 
        int i=arr.size()-1;
        while(i>=0)
        {
            if(!isPrime(arr.get(i)) || arr.get(i)==1)
            {
             newArr.add(arr.get(i));
            }
            i--;
        }
        return newArr;
    }
    public static void main(String[] args){
    //  removeData();
    int n=scn.nextInt();
        
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<5;i++)
        {
            int a= scn.nextInt();
            arr.add(a);
        }
    ArrayList<Integer> arr1=  removePrimes(arr);
    System.out.println(arr1);
    }
}