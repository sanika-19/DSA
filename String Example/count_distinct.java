import java.util.*;

class count_distinct{

    ArrayList<Integer> countDistinct(int arr[], int k) {

        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        // Build first window
        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        ans.add(map.size());

        // Slide the window
        for (int i = k; i < arr.length; i++) {

            // Add incoming element
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

            // Remove outgoing element
            int out = arr[i - k];
            map.put(out, map.get(out) - 1);
            if (map.get(out) == 0) {
                map.remove(out);
            }

            ans.add(map.size());
        }

        return ans;
    }

    // 🔹 Main method
    public static void main(String[] args) {

        count_distinct obj = new count_distinct();

        int[] arr = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;

        ArrayList<Integer> result = obj.countDistinct(arr, k);

        System.out.println("Count of distinct elements in each window:");
        System.out.println(result);
    }
}
