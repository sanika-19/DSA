import java.util.Stack;

public class st_Reverse {
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void Reverse_Stack(Stack<Integer> s) {
        if (s.isEmpty()) {

            return;
        }
        int top = s.pop();
        Reverse_Stack(s);
        pushAtBottom(s, top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st);
        Reverse_Stack(st);
        System.out.println(st);
    }
}
