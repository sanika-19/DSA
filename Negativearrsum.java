public class Negativearrsum {
    public static void neg_arr_sum(int arr[]){
        int cs=0;
        int smallest=arr[0];
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
          if(arr[i]<0){
            if(arr[i]>smallest){
                smallest=arr[i];
            }
          }





        }
        System.out.println("Max array sum="+smallest);
    }
    public static void main(String[] args) {
        int arr[]={-1,-2,-3,-4};
        neg_arr_sum(arr);
    }
}
