public class string_palindrome {
    public static  boolean check_palindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            int n=str.length();
            if(str.charAt(i)!=str.charAt(n-1-i)){
            //not a palindrome
            System.out.println("String is not Palindrome");
            return false;
            }
        }
        System.out.println("String is Palindrome!!");
        return true;
    }
    public static void main(String[] args) {
        String str="happy";
        check_palindrome(str);
    }
}
