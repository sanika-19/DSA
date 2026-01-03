class car{
    int a;
    car(){
        a=10;
    }
    void msg(){
        System.out.println("herllo="+a);
    }
}
class swift extends car{
    void msg(){
        super.msg();
        System.out.println("I am swift!="+a);
    }
}


public class bitwise {
    
    public static void main(String[] args) {
        swift c=new swift();
        c.msg();
        
        // System.out.println(5&4);
        // System.out.println(5|6);
        // System.out.println(5^6);
        // System.out.println((~5));
        // System.out.println((~0));
        // System.out.println(6>>1);
    }
}
