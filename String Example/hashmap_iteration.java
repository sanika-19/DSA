import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class hashmap_iteration {
    public static void main(String[] args) {
        HashMap<String,Integer>map=new HashMap<>();
        map.put("India",2000);
        map.put("China", 5000);
        map.put("Rashia", 500);
        map.put("Us", 1500);
        // Iteration
        Set<String>st=map.keySet();System.out.println(st);
        for (String key : st) {
            System.out.println("Key:"+key+","+"Value:"+map.get(key));
        }
    }
}
