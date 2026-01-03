public class arr_2d_ex1 {
    public static void count_7s(int m[][]){
        int c=0;
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
            if(m[i][j]==7){
                c++;
            }
        }
        }
        System.out.println("Total Count="+c);
    }
    public static void main(String[] args) {
        int[][] array={{4,7,8},{8,8,7}};
        count_7s(array);
    }
}
