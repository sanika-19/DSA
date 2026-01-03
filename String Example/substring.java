public class substring {
    public static void substrings(String str,int si,int ei){
        String substr="";
        for(int i=si;i<ei;i++){
           substr+=str.charAt(i);
        }
        System.out.println(substr);
    }
    public static void main(String[] args) {
        //Substring
        String str="Helloworld";
        substrings(str,0, 5);

    }
}
