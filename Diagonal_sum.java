public class Diagonal_sum {
    public static void sum_diagonal(int mat[][]){
        int sum=0;
        // for(int i=0;i<mat.length;i++){
        //     for(int j=0;j<mat[0].length;j++){
        //        if(i==j){
        //         sum+=mat[i][j];
        //        }
        //         else if(i+j==mat.length-1){
        //         sum+=mat[i][j];
        //        }
        //     }
        // }
        for(int i=0;i<mat.length;i++){
            // primary Diagonal
            sum+=mat[i][i];
            // secondary Diagonal
            if(i!=mat.length-i-1)
               sum+=mat[i][mat.length-i-1];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        sum_diagonal(matrix);
    }
}
