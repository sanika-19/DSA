public class search_in_SorttedMatrix {
    //Consider Right most element
    public static boolean StaircaseSearch(int mat[][],int key){
      int row=0,col=mat[0].length-1;
      while(row< mat.length && col >=0){
         if(mat[row][col]==key){
         System.out.println("Key Found at("+row+","+col+")");
         return true;
         }
         else if(key<mat[row][col]){
            col--;
         }
         else if(key>mat[row][col]){
            row++;
         }
      }
      System.out.println("Key not found!!");
      return false;
        }
    
    public static void main(String[] args) {
        int matrix[][]={{10,20,30,40},{15,15,35,45},{27,29,37,48},{32,33,39,50}};
        int key=33;
        StaircaseSearch(matrix,key);
    }
}
