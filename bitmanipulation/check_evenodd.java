public class check_evenodd{
    public static void even_odd(int num){
        int bitmask=1;
        if((num & bitmask)==0){
        //even number
        System.out.println("Even Number!!");
        }
        else{
            System.out.println("Odd number!!");
        }
    }
    public static int get_ith_bit(int no,int i){
     int bitmask=1<<i;
     if((no & bitmask)==0){
        return 0;
     }else{
         return 1;
     }
    }

    
    public static int set_ith_bit(int no,int i){
        int bitmask=1<<i;
       return no|bitmask;
    }
    public static int clear_ith_bit(int no,int i){
        int bitMask=~(1<<i);
        return no & bitMask;
    }
    public static int update_ith_bit(int n,int i,int new_bit){
        //  if(new_bit==0){
        //    return clear_ith_bit(n, i);
        //  }
        //  else{
        //    return set_ith_bit(n, i);
        //  }
         n=clear_ith_bit(n, i);
        int bitMask=new_bit<<i;
        return n| bitMask;
    }
public static void main(String[] args) {
    even_odd(10);
    even_odd(5);
    even_odd(12);
    System.out.println(get_ith_bit(15, 2));
    System.out.println(get_ith_bit(10,4));
    System.out.println(set_ith_bit(10, 2));
    System.out.println(clear_ith_bit(10, 1));
    System.out.println(update_ith_bit(10,2,1));
    
}
}