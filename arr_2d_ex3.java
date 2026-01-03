public class arr_2d_ex3 {
    public static void Transpose(){
        int col=3,row=2;
        int[][] matrix={{4,7,8},{8,8,7}};
        int [][] transpose=new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
              transpose[j][i]=matrix[i][j];
            }
            
        }
        print_matrix(transpose);
    }
    public static void print_matrix(int m[][]){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
             System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] array={{4,7,8},{8,8,7}};
        System.out.println("Original Matrix:");
        print_matrix(array);
        System.out.println("Transpose Matrix:");
        Transpose();
        

    }
}
