import java.util.Arrays;

public class string_logestsubstr {

    public  static int longestSubstr(String s){
        int n=s.length();
        int l=0,r=0,maxlength=0;
        int len=0;
        int []hash=new int[256];
        Arrays.fill(hash, -1);
        while(r<n){
            if(hash[s.charAt(r)]!=-1){
                if(hash[s.charAt(r)]>=l){
                    l=hash[s.charAt(r)]+1;
                }
            }
            len=r-l+1;
            maxlength=Math.max(maxlength, len);
            hash[s.charAt(r)]=r;
            r++;
        }
        return maxlength;
    }
    public static void main(String[] args) {
        String s="cadbzabcd";
        int total=longestSubstr(s);
        System.out.println("Longest substring:"+total);
    }
}
