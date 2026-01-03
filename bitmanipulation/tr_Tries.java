public class tr_Tries {
    static class Node {
     Node childs[]=new Node[26];
     boolean eow=false;
     public Node(){
        for(int i=0;i<26;i++){
            childs[i]=null;
        }
     } 
    }
    public static Node root=new Node();
    public static void insert(String word){//O(L) length of largest word
    Node curr=root;
    for(int level=0;level<word.length();level++){
        int idx=word.charAt(level)-'a';
        if(curr.childs[idx]==null){
            curr.childs[idx]=new Node();

        }
        curr=curr.childs[idx];
    }
   curr.eow=true;
    }
    public static boolean Search(String key){
        Node curr=root;
        for(int l=0;l<key.length();l++){
          int idx=key.charAt(l)-'a';
          if(curr.childs[idx]==null){
            return false;
           
          }
           curr=curr.childs[idx];

        }
        return curr.eow==true;
        
        
    }
    public static void main(String[] args) {
        String words[]={"the","a","there","their","any","thee"};
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
        System.out.println(Search("thee"));
         System.out.println(Search("thor"));

    }
}
