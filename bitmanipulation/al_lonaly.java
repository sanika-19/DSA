import java.util.ArrayList;

public class al_lonaly {
    public static void find_lonaly(ArrayList<Integer>list){
    ArrayList<Integer>ans=new ArrayList<>();
    for(int i=0;i<list.size();i++){
        if(list.get(i+1)+1>=list.get(i)){
          continue;
        }
        else{
            ans.add(null);
        }
    }
    System.err.println(ans);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);
      find_lonaly(list);
    }
}
