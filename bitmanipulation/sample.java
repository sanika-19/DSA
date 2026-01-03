public class sample {
    public static void staircase(int n) {
    // Write your code here
    for(int i=0;i<n;i++){
        for(int j=;j<n;j++){
            System.out.print("#");
        }
        System.out.println();
    }

    }
    public static void main(String[] args) {
       int n=6;
       staircase(n);
    }
}
