

public class ReverseArraycc6 {
    public static void reverseArray(int arr[]){
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr1[]={10,20,30,40,50};
        reverseArray(arr1);
    }
    
}
