import java.util.ArrayList;

public class al_max {
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
        l1.add(50);
        l1.add(20);
        l1.add(230);
        l1.add(140);
        l1.add(50);
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < l1.size(); i++) {
            // if(max<l1.get(i)){
            //     max=l1.get(i);
            // }
            max=Math.max(max, l1.get(i));
        }
        System.out.println(max);



    }
}
