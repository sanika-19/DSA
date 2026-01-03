public class power_of_2 {
    public static boolean ispoweroftwo(int n){
        return (n&(n-1))==0;
    }
    public static void main(String[] args) {
        System.out.println(ispoweroftwo(32));
    }
}
