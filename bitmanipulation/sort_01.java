public class sort_01 {
    public static void printarr(int arr[]){
        for(int i=0;i<=5;i++){
           System.out.print(arr[i]+" ");
        }
    }
    public static void sort_arr(int arr[],int size){
        int i=0,j=size-1;
        while(i<=j){
            if(arr[i]>arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            i++;
            j--;
        }
    
    }
    public static void main(String[] args) {
        int arr[]={0,1,1,0,0,1};
        sort_arr(arr,6);
        printarr(arr);
    }
}
