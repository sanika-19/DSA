import java.util.Scanner;

public class String_ex {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // String name=sc.nextLine();
        // System.out.println("Hello\t"+name);
        String s1="Bharati Vidyapeeth";
        System.err.println("Length="+s1.length());
        String s3="Kadegaon";
        //concatanation
        String s2=s1.concat(s3);
        System.out.println(s2);
        String strr="Sanika More";
        for(int i=0;i<strr.length();i++)
        System.out.print(strr.charAt(i)+" ");
    }
}
