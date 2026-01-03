import java.util.*;

public class st_duplicateParanthesis {
    public static boolean isDuplicateParanthesis(String str){
        Stack <Character>st=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            //closing
            if(ch==')'){
                int count=0;
                while(st.pop()!='('){
                  count++;
                }
                if(count<1){
                    return true;//duplicate exist
                }  

            }else{
                //Opening Operator,operand
                st.push(ch);
            }

        }
       return false;
    }
    public static void main(String[] args) {
        String str="((a+b))";
        String str1="(a+b)";
       System.out.println(isDuplicateParanthesis(str));
       System.out.println(isDuplicateParanthesis(str1));
    }
}
