public class count_set_bit {
    public static void countSetBit(int num){
        int count=0;
        while (num>0) {
             if((num&1)!=0){
            count++;
             }
        num=num>>1;

        }
        System.out.println("Count="+count);
    }
    public static void main(String[] args) {
        countSetBit(8);
    }
}
