public class PairInArraycc7 {
    //Posible Pair
    public static void PairInArr(int arr[]){
        int tp=0;
        
           for(int i=0;i<arr.length;i++){
            int curr=arr[i];//2,4,6,8,20
            for(int j=i+1;j<arr.length;j++){//Print pair
            System.out.print("("+curr+","+arr[j]+")");
            tp++;
            }
            System.out.println();
            
           }
System.out.println(tp);
    }
    public static void main(String args[]){
        int arr[]={2,4,6,8,10};//[2,4],[2,6],[2,8],[2,10]....
        PairInArr(arr);

    }
}
