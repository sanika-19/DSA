import java.util.Scanner;

public class linearSearchcc3 {
    public static int check(String menu[],String key){
       
        for(int i=0;i<menu.length;i++){
            if(menu[i]==key){
               return i;
            }
           
        }
        return -1;
    }
    
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={10,20,30,40,50,60,70,80};
        String menu[]={
            "Idli","Dosa","Upama","Pohe","Maggiee"
        };
        int key=05;
        String str=sc.next();
        int index=check(menu,str);
        if(index==-1){
            System.out.println("Not Found!!");
        }
        else{
        System.out.println("Element found at :"+index);
        }
    }
}
