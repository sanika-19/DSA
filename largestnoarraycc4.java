public class largestnoarraycc4 {
    public static int largestno(int arr1[]){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr1.length;i++){
           if (max<arr1[i]){
            max=arr1[i]; 
           }
           if(min>arr1[i]){
            min=arr1[i];
           }
        }
        System.out.println("Smallest value:"+min);
         return max;
         
    }

    public static void main(String[] args) {
        int arr1[]={10,7,50,23,70,12};
        System.out.println("Largest No:"+largestno(arr1));
        

    }
}