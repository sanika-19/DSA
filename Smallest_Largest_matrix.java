import java.util.Scanner;

public class Smallest_Largest_matrix {
    public static void Small_largeNo(int mat[][] ){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]<min){
                    min=mat[i][j];
                }
                else if(mat[i][j]>max){
                    max=mat[i][j];
                }
               
            }
            
        }
        System.out.println("Minimum="+min+"\n"+"Maximum="+max);

    }
    public static void printmatrix(int mat[][]){
          for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
               System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int matrix[][]=new int[3][3];
        System.out.println("Enter Element:");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("2D Array=");
        
       printmatrix(matrix);
       Small_largeNo(matrix);
    }
}
