public  class sort01{
    public static void Sort10(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]==0){
                i++;
            }
         else {
                if(arr[j]!=1 ){
                 int temp=arr[i];
                 arr[i]=arr[j];
                 arr[j]=temp;
                 i++;
                 j--;
                }
                else{
                    j--;
                }
            }
            
        }
    }


    public static void sort012(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
        if(arr[i]==1 ){
            if(arr[j]!=1){
                if(arr[j]==0){
                    int temp =arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    i++;
                    j--;
                }
                else{
                    j--;             
                }
            }

        }
        }
    }
public static void main(String[] args) {
    int[] arr={0,1,1,0,0,1,0};
    Sort10(arr);
    for(int e:arr){
        System.out.println(e);
    }
    
}
}