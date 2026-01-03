import java.util.ArrayList;
import java.util.*;

public class array_list1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Float> list2 = new ArrayList<>();
           list.add(1);
           list.add(2);
           list.add(3);
           list.add(4);
           list.add(5);
        //    System.out.println(list);
        //    int ele=list.get(2);//O(1)
        //    System.out.println(ele);
        //    //Remove element
        //    list.remove(3);
        //    System.out.println(list);

           //set element add index
           list.set(3, 10);
           System.out.println(list);
           //contains
           System.out.println(list.contains(11));
           System.out.println(list.contains(10));
    }
}
