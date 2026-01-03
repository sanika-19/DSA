import java.util.Arrays;

public class grd_min_abs_diff_pair {
    public static void main(String[] args) {
      
        int a[]={4,1,8,7};
        int b[]={2,3,6,5};
        Arrays.sort(a);
        Arrays.sort(b);
        int mindiff=0;
       for(int i=0;i<a.length;i++){
        mindiff+=Math.abs(a[i]-b[i]);
       }
       System.out.println("MinDifference="+mindiff);
    }
}
