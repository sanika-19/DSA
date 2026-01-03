public class ReverseArrayOptimize {
    public static void reverseArray(int arr1[]){
        int first=0,last=arr1.length-1;
        while(first<last){
            //swap 
            int temp=arr1[last];
            arr1[last]=arr1[first];
            arr1[first]=temp;

            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40};
        reverseArray(arr);
       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
       }
    }
}
