
public class Arrays {
    public static void BubbleSort(int arr[]){
      for(int i=0;i<arr.length-1;i++){
        int swap=0;
        for(int j=0;j<arr.length-1-i;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                swap++;
            }
        }
        System.out.println(swap);
      }
      
    }
    public void Printarr(int arr[]){
      for(int i=0;i<arr.length-1;i++){
        System.out.print(arr[i]+" ");
      }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        BubbleSort(arr);
        Printarr
    }
}
