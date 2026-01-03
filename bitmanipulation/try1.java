import java.util.Arrays;

public class try1 {
public static String largestNumber(int[] nums) {
     int si=0,ei=nums.length-1;
     while(si<ei){
        int temp=nums[si];
        si=nums[ei];
        ei=temp;
        si++;
        ei--;
     }
     StringBuilder sb=new StringBuilder();
     for(int i:nums){
        sb.append(i);
     }
     String str2=sb.toString();
     return str2;
}
public static void main(String[] args) {
   int arr[]={3,30,34,5,9};
   System.out.println(largestNumber(arr));
}
}
