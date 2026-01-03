public class practice{
    public static void Subarray(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]);
                   
                }
                
                System.out.println();
                count++;

            }
        }
       System.out.println("Total Sub array:"+count);
    }
    public static void main(String args[]){
        int arr[]={10,20,30,40,50};
        Subarray(arr);

    }
}