import java.util.Scanner;

public class SpiralMatrix {
    public static void print_Spiral(int matrix[][]){
        int startrow=0;
        int endrow=matrix.length-1;
        int startcol=0;
        int endcol=matrix[0].length-1;
        while(startrow<=endrow && startcol<=endcol){//Only for even matrix 4X4
            // Top
            for(int j=startcol;j<=endcol;j++){
                System.out.println(matrix[startrow][j]+" ");
            }
            //right
            for(int i=startrow+1;i<=endrow;i++){
            System.out.println(matrix[i][endcol]+" ");
            }
            //Bottom
            if(startrow==endrow){//for odd matrix
              break;

            }
            for(int j=endcol-1;j>=startcol;j--){
            System.out.println(matrix[endrow][j]+" ");
            }
            //left
            for(int i=endrow-1;i>=startrow+1;i--){
                if(startcol==endcol){//for odd matrix
              break;
            }
            System.out.println(matrix[i][startcol]+" ");
            }
            startcol++;
            startrow++;
            endcol--;
            endrow--;

        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        int mat[][]={
        {1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,16}};
        // System.out.println("Enter the Element:");
      print_Spiral(mat);

    }
}
