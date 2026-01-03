public class maxsubarraysum {
   
    public static void PrintSubArray(int num[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;   //-infity;
        for(int i=0;i<num.length;i++){
            int start=i;//2,4,6,8,10
            for(int j=i;j<num.length;j++){
                int end=j ;//4,6,8,10
                currsum=0;
                for(int k=start;k<=end;k++){
                  //Sum of sub array
                  currsum+=num[k];
                  System.out.println("sum="+currsum);
                  if(maxsum<currsum){
                    maxsum=currsum;
                  }
                  
               
                
                }
                
                System.out.println();
                

            }
        }
        System.out.println("Max Sum Of Subarray="+maxsum);
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        PrintSubArray(arr);
    }
}


