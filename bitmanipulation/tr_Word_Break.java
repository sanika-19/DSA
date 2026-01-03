public class tr_Word_Break {
    static class Node {
        Node childs[]=new Node[26];
        boolean eow=false;
        public Node(){
          for(int i=0;i<26;i++){
            childs[i]=null;
          }
        } 
    }
    static Node root=new Node();
  public static void insert(String word){
      word = word.toLowerCase();
     Node curr=root;
     for(int l=0;l<word.length();l++){
        int idx=word.charAt(l)-'a';
        if(curr.childs[idx]==null){
          curr.childs[idx]=new Node();
        }
        curr=curr.childs[idx];
     }
     curr.eow=true;
  }
  public static boolean Search(String key){
    Node curr=root;
      key = key.toLowerCase();
    for(int l=0;l<key.length();l++){
        int idx=key.charAt(l)-'a';
        if(curr.childs[idx]==null){
           return false;
        }
        curr=curr.childs[idx];
    }
    return curr.eow==true;
  }
  public static boolean WordBreak(String key){
    if(key.length()==0){
        return true;
    }
     for(int i=1;i<=key.length();i++){
        //  substring(0,i)
       if(Search(key.substring(0, i)) && WordBreak( key.substring(i))){
        return true;
       } 
     }
     return false;
  }

    public static void main(String[] args) {
        String words[]={"i","like","sam","samsung","Mobile","ice"};
        String key="ilikesung";
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
        System.out.println(WordBreak(key));
    }
}
