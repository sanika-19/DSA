public class clear_last_ith_bit {
    public static int clear_last_ith(int n,int i){
        int BitMask=-1<<i;
        return n & BitMask;
    }
    public static void main(String[] args) {
        System.out.println(clear_last_ith(15, 2));
    }
}
