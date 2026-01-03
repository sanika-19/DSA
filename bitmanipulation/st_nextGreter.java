import java.util.*;

public class st_nextGreter {
    public static void next_greter(int arr[], int ng[]) {
        Stack<Integer> st = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            // step 1: while
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();

            }
            // if-else

            if (st.isEmpty()) {
                ng[i] = -1;
            } else {
                ng[i] = arr[st.peek()];
            }
            // push ele into stack
            st.push(i);
        }

        for (int i = 0; i < ng.length; i++) {
            System.out.print(ng[i] + " ");
        }

    }

    public static void main(String[] args) {
        int arr[] = {5, 6,3, 8, 15, 1 };
        int next_greter[] = new int[arr.length];
        next_greter(arr, next_greter);

    }
    // Next Greter Right
    //Next Greter left
    //Next smaller left
    //next smaller right
}
