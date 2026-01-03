public class largest_String {
    
public static void get_largest(String[]arr){
    String largest=arr[0];
    for(int i=1;i<arr.length;i++){
        if(largest.compareTo(arr[i])<0){
            largest=arr[i];
        }
    }
    System.out.println(largest);//Lexically Largest

}
public static void main(String[] args) {
    String arr[]={"Apple","Banana","Chiku"};
    get_largest(arr);
}
}
