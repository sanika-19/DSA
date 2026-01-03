import java.util.Stack;

public class st_ReverseString {
    public static String Reverse_string(String str) {
         Stack<Character>st=new Stack<>();
         int idx=0;
         while(idx<str.length()){
            st.push(str.charAt(idx));
            idx++;
         }
         StringBuilder result=new StringBuilder("");
         while (!st.isEmpty()) {
            char top=st.pop();
            result.append(top);
         }
         return result.toString();
    }

    public static void main(String[] args) {
        
       System.out.println(Reverse_string("Sanika"));
    }
}
