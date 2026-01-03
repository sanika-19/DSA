public class BinarySearchcc5 {
    public static int BinarySearch(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            //Comparison
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){    //Right
                start=mid+1;
            }
            else{                 //Left
                 end=mid-1;
            } 
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr1[]={10,20,30,40,50};
        int key=50;
        System.out.println("Element Fount at:"+BinarySearch(arr1,key));
        

    }
}
