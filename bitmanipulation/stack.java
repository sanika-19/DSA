import java.util.ArrayList;

public class stack{

    static class StackB{
          static ArrayList<Integer> list=new ArrayList<>();
          public static boolean isEmpty(){
            return list.size()==0;
          }
          //push
          public static void push(int data){
            list.add(data);
          }
          //pop
          public static int pop(){
            if(isEmpty()){
              return -1;
            }
          int top=list.get(list.size()-1);
          list.remove(list.size()-1);
          return top;
          }
          //peek
          public static int peek(){

            if(isEmpty()){
              return -1;
            }
            return list.get(list.size()-1);
          }
    }
    public static void main(String[] args) {
        StackB  st=new StackB();
        // st.push(10);
        // st.push(20);
        // st.push(30);
        // st.push(40);
        // while (!st.isEmpty()) {
        //   System.out.print(st.peek() +" ");
        //   System.out.println(st.pop());
        // }
        
    }
}
