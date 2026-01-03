import java.util.ArrayList;

public class al_multi {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> Main_List = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i=1;i<=5;i++){
            list1.add(1*i);
            list2.add(2*i);
            list3.add(3*i);

        }
     Main_List.add(list1);
     Main_List.add(list2);
     Main_List.add(list3);
    // for(int i=0;i<Main_List.size();i++){
    //     ArrayList<Integer>curr=Main_List.get(i);
    //    System.out.print(Main_List);
    // }
      System.out.print(Main_List);
    }
}
