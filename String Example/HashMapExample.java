import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String,Integer>map=new HashMap<>();
        // Insert O(1)
        map.put("India",100);
        map.put("Us",250);
        map.put("Rashia",30);
        System.out.println(map);
        // GETO(1)
        System.out.println(map.get("china"));
        //containsKey() O(1)
        System.out.println(map.containsKey("Us"));

        // Remove 
        map.remove("Us");
        System.out.println(map);
        // Size
        System.out.println("Size:"+map.size());

        //isEmpty
        map.clear();
        System.out.println(map.isEmpty());
    }
}
