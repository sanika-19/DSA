 public class maxArraySum1 {
    public static void  maxsubarraysum(int arr[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
    for( int i=0;i<arr.length;i++){
        currsum=i;
    for(int j=i;j<arr.length;j++){
        currsum=0;
       for(int k=i;k<=j;k++){
        //Sum of subarray
        currsum+=arr[k];
       
       }
       System.out.println(currsum);
        if(currsum>maxsum){
              maxsum=currsum;
        }
    }
}
    System.out.println("Max array Sum="+maxsum);
}

    
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        maxsubarraysum(arr);
    }
}
 
