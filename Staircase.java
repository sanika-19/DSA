public class Staircase {
    public static boolean search(int mat[][],int key){
        int row=mat.length-1,col=0;
        while(row>=0 && col<mat[0].length){
            if(mat[row][col]==key){
                System.out.println("Key Found at index("+row+","+col+")");
                return true;
            }
            else if(key<mat[row][col]){
                row--;
            }
            else{
                col++;
            }
        }
        System.out.println("Key not found!!");
        return false;

    }
    public static void main(String[] args) {
        int matrix[][]={{10,20,30,40},{15,15,35,45},{27,29,37,48},{32,33,39,50}};
        int key=10;
        search(matrix,key);
    }
}
