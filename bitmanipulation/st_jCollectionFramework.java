import java.util.Stack;

public class st_jCollectionFramework {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        while (!st.isEmpty()) {
            System.out.print(st.peek() + " ");
            st.pop();
        }
    }
}
