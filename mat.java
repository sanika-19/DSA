public class mat {
    public static void print_diagonal(int m[][]){
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                if(i==j){
                m[i][j]=0;
                // System.out.println(m[i][j]);
                }
            }
        }
    }
    public static void print_matrix(int m[][]){
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++)
            {
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
            }
    }
    
    public static void main(String args[]){
     int mat[][]={{1,2},{3,4}};
     print_diagonal(mat);
     print_matrix(mat);
    }
}
