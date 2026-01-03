import java.util.*;
public class heap_sort {
    public static void heapify(int arr[],int i,int sz){
        int left=2*i+1;
        int right=2*i+2;
        int mixidx=i;
        if(left<sz && arr[left]>arr[mixidx] ){
            mixidx=left;
        }
        if(right<sz && arr[right]>arr[mixidx] ){
            mixidx=right;
        }
        if(mixidx !=i){
            int temp=arr[i];
            arr[i]=arr[mixidx];
            arr[mixidx]= temp;
            heapify(arr, mixidx, sz);
        }

    }
    public static void heapSort(int arr[]){
        int n=arr.length;
        //Step 1 -Build MaxHeap
        for(int i=n/2;i>=0;i--){
            heapify(arr,i,n);
        }

        //Step 2- Push lasgest element at last idx
        for(int i=n-1;i>=0;i--){
            //swap largest-first to last
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify( arr,0, i);
        }
       
    }
    public static void main(String[] args) {
       int arr[]={1,2,4,5,3};
       heapSort(arr);
       for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
       }

       
    }
}
