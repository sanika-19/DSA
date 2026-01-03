import java.util.ArrayList;
import java.util.Collections;

public class al_sort {
    public static void main(String[] args) {
         ArrayList<Integer> l1=new ArrayList<>();
        l1.add(2);
        l1.add(1);
        l1.add(9);
        l1.add(5);
        l1.add(3);
        System.out.println("Ascedding Order:");
        Collections.sort(l1);
        System.out.println(l1);
        System.out.println("decedding Order:");
        Collections.sort(l1,Collections.reverseOrder());
        System.out.println(l1);
        
    }
}
