import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class hashmap_NextGreaterFrequency {

     public ArrayList<Integer> nextFreqGreater(int[] arr) {

        int n = arr.length;

        // Step 1: Frequency map
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int x : arr) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        // Step 2: Result list initialized with -1
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) ans.add(-1);

        // Step 3: Stack to store indices
        Stack<Integer> st = new Stack<>();

        // Step 4: Traverse array
        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() &&
                   freq.get(arr[st.peek()]) < freq.get(arr[i])) {
                ans.set(st.pop(), arr[i]);
            }

            st.push(i);
        }

        return ans;
    }
    public static void main(String[] args) {
        hashmap_NextGreaterFrequency solution = new hashmap_NextGreaterFrequency();
        int[] arr = {1, 1, 2, 3, 4, 2, 1};
        ArrayList<Integer> result = solution.nextFreqGreater(arr);
        System.out.println("Next Greater Frequency elements: " + result);
    }
}
