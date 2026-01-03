public class arr_2d_ex2 {
    public static void sum_row(int m[][]){
        int sum=0;
        //Sum of second row element
        for(int j=0;j<m[0].length;j++){
            sum+=m[1][j];
            
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
         int[][] nums={{1,4,9},{11,4,3},{2,2,3}};
        sum_row(nums);
    }
}
