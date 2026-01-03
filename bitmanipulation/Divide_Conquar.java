public class Divide_Conquar {
    public static void print_array(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int partition(int arr[],int si,int ei){
        int pivot=arr[ei];
        int i=si-1;//to make place for samller element than pivot
        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        //swap
         int temp=pivot;
                arr[ei]=arr[i];
                arr[i]=temp;
                return i;

    }
    public static void quick_Sort(int arr[],int si,int ei){
        //last Element
        if(si>=ei){
            return;
        }
        int pidx=partition(arr,si,ei);
        quick_Sort(arr, si, pidx-1);
        quick_Sort(arr, pidx+1, ei);
        
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,8,2,5};
        quick_Sort(arr,0,arr.length-1);
        print_array(arr);

    }
}
