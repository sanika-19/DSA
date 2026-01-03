// package String Example;
import java.math.*;

public class ShortPath {
    public static float shortest_Path(String path){
        int x=0, y=0;
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            //South
            if(dir=='s'){
                y--;
            }
            //North
           else if(dir=='n'){
                y++;
            }
            //East
            else if(dir=='e'){
                x++;
            }
            //West
            else{
                x--;
            }
        }
        //Put into formula
      int x2=x*x;
       int y2=y*y;
       return ((float)Math.sqrt(x2+y2));
    }
    public static void main(String[] args) {
        String str="wneenesennn";
       System.out.println(shortest_Path(str)); 
        
    }
}
