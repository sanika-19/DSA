import java.util.*;

public class st_validaprathesis {
    public static boolean isValidParathesis(String str){
        Stack <Character>st=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{'){ //Oenning
                st.push(ch);
            }else{
               //Closing
               if(st.isEmpty()){
                return false;
               }
               //Pair
               if((st.peek()=='('&& ch==')'||
                st.peek()=='[' && ch==']'||
                st.peek()=='{' && ch=='}')){
                st.pop();
               }
               else{
                return false;
               }
            }
        }
       if(st.isEmpty()){
          return true;
       }
       else{
        return false;
       }
    }
    public static void main(String[] args) {
        String str=new String("({[]}))");
        System.out.println(isValidParathesis(str));

    }
}
