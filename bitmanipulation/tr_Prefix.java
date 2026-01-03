import java.util.ArrayList;

public class tr_Prefix {
    static class Node {
        Node childs[] = new Node[26];
        boolean eow = false;
        int freq;

        public Node() {
            for (int i = 0; i < 26; i++) {
                childs[i] = null;
            }
            freq = 1;
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        word = word.toLowerCase();
        for (int l = 0; l < word.length(); l++) {
            int idx = word.charAt(l) - 'a';
            if (curr.childs[idx] == null) {
                curr.childs[idx] = new Node();
            } else {
                curr.childs[idx].freq++;
            }
            curr = curr.childs[idx];
        }
        curr.eow = true;
    }

    public static ArrayList<String> FindPrefix(String word) {
        Node curr = root;
        ArrayList<String> arr = new ArrayList<>();
        StringBuilder prefix = new StringBuilder();
        word = word.toLowerCase();
        
        for (int l = 0; l < word.length(); l++) {
            int idx = word.charAt(l) - 'a';
            prefix.append(word.charAt(l));
             if (curr.childs[idx] == null) break;
            curr = curr.childs[idx];
            if (curr.freq == 1) {
                break;
            }

        }
        arr.add(prefix.toString());
        return arr;
    }

    public static void main(String[] args) {
        String words[] = { "zebra", "dog", "duck", "dove" };
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
    }
}
