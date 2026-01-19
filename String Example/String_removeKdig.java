public class String_removeKdig {

     public String removeKdig(String s, int k) {
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            // Remove previous larger digits
            while (k > 0 && sb.length() > 0 && sb.charAt(sb.length() - 1) > ch) {
                sb.deleteCharAt(sb.length() - 1);
                k--;
            }
            sb.append(ch);
        }

        // If k still remains, remove from end
        while (k > 0 && sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
            k--;
        }

        // Remove leading zeros
        int idx = 0;
        while (idx < sb.length() && sb.charAt(idx) == '0') {
            idx++;
        }

        sb = new StringBuilder(sb.substring(idx));

        return sb.length() == 0 ? "0" : sb.toString();
    }
    public static void main(String[] args) {
         String_removeKdig solution = new String_removeKdig();
         System.out.println(solution.removeKdig("1432219", 3));
    }
}
