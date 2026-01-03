import java.util.Scanner;

public class matrix {
    public static boolean serch(int arr[][],int key){
         for(int i=0;i<3;i++){    //Rows
            for(int j=0;j<3;j++){//column
                if(arr[i][j]==key){
                    System.out.println("Key Found at index("+i+","+j+")");
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int [][] mat=new int[3][3];
       
        System.out.println("Enter the Element:");
        for(int i=0;i<3;i++){    //Rows
            for(int j=0;j<3;j++){//column
                mat[i][j]=sc.nextInt();
            }
        }
        serch(mat, 5);
        System.out.println("2D Array :");
         for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

    }
}
