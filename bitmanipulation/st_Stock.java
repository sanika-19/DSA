import java.util.*;
public class st_Stock {
    public static void StockSpan(int[] stock,int[]span ){
     Stack<Integer>st=new Stack<>();
     span[0]=1;
     st.push(0);
     for(int i=1;i<stock.length;i++){
        int currprice=stock[i];
        while(!st.isEmpty()&& currprice>stock[st.peek()]){
            st.pop();
        }
        if(st.isEmpty()){
            span[i]=i+1;
        }else{
            int prevhigh=st.peek();
            span[i]=i-prevhigh;
        }
        st.push(i);
    }
    }
    public static void main(String args[]){
        int stock[]={100,80,60,70,60,85,100};
        int span[]=new int[stock.length];
        StockSpan(stock,span);
        for(int i=0;i<span.length;i++){
            System.out.print(span[i]+" ");
        }
    }
 
}
