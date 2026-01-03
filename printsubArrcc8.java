public class printsubArrcc8 {
    public static void PrintSubArray(int num[]){
        int total=0;
        int sum=0;
        for(int i=0;i<num.length;i++){
            int start=i;//2,4,6,8,10
            for(int j=i;j<num.length;j++){
                int end=j ;//4,6,8,10
                for(int k=start;k<=end;k++){
                   System.out.print(num[k]);//print
                //    System.out.print();
                
                }
                
                System.out.println();
                total++;

            }
        }
        System.out.println("Total sub arrays="+total);
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        PrintSubArray(arr);
    }
}
