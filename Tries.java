package Apna_College;

public class Tries {
    static  class Node{
        Node[] children = new Node[26];
        boolean eow;
        public  Node(){
            for (int i=0; i<26; i++){
                children[i] = null;
            }
            eow = false;
        }
    }
    static  Node root = new Node();

    public  static  void insert(String word){
        Node curr = root;
        for(int i=0;i<word.length();i++){
            int idx = word.charAt(i)-'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            if (i==word.length()-1){
                curr.children[idx].eow = true;
            }
            curr = curr.children[idx];
        }
    }
    public  static  boolean search(String key){
        Node curr = root;
        for(int i=0;i<key.length();i++){
            int idx = key.charAt(i)-'a';
            Node node = curr.children[idx];
            if(node == null){
                return  false;
            }
            if(i== key.length()- 1 && node.eow == false){
                return  false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    public static boolean wordBreak(String key){
        if(key.length()==0){
            return  true;
        }
        for(int i=1; i<=key.length(); i++){
            String firstPart = key.substring(0,i);
            String secPart = key.substring(i);
            if(search(firstPart) && wordBreak(secPart)){
                return  true;
            }
        }
        return  false;
    }
    public  static  int countNode(Node root){
        if(root==null){
            return  0;
        }
        int count = 0;
        for(int i=0;i<26;i++){
            if(root.children[i]!= null){
                count += countNode(root.children[i]);
            }
        }
        return  count+1;
    }

    public  static  boolean startWith(String Prefix){
        Node curr = root;
        for (int i=0; i<Prefix.length();i++){
            int index = Prefix.charAt(i) -'a';
            if (curr.children[index] == null){
                return  false;
            }
            curr = curr.children[index];
        }
        return true;
    }
    public  static String ans = " ";
    public  static  void  longestWord(Node root, StringBuilder temp){
        if(root == null ){
            return;
        }
        for(int i=0; i<26; i++){
            if(root.children[i]!=null && root.children[i].eow==true){
                temp.append((char)(i+'a'));
                if(temp.length()>ans.length()){
                    ans = temp.toString();
                }
                longestWord(root.children[i],temp);
                temp.deleteCharAt(temp.length()-1);

            }
        }
    }

    public static void main(String[] args) {
//        String  words[] = {"the","a","there","their","any"};
//        for(int i=0;i<words.length;i++){
//            insert(words[i]);
//        }
//        System.out.println(search("their"));
//        System.out.println(search("thor"));
//        System.out.println(search("an"));
//
//        String [] word= {"i","like","sam","sumsung","mobile"};
//        String key = "ilikesumsung";
//
//        for (int i=0;i<word.length;i++){
//            insert(word[i]);
//        }
//

//        System.out.println("Word Break = " + wordBreak(key));
//
//        String [] arr = {"apple","app","mango","woman"};
//        String prefix = "app";
//
//        for (int i=0;i<arr.length;i++){
//            insert(arr[i]);
//        }
//
//        System.out.println("Prefix = " + startWith(prefix));

//        String  str = "ababa";
//        for(int i=0; i<str.length();i++){
//            String suffix = str.substring(i);
//            insert(suffix);
//        }
//        System.out.println(countNode(root));
        String arrayOfWord[] = {"a","banana","app","appl","ap","apply","apple"};
        for(int i=0; i<arrayOfWord.length;i++){
            insert(arrayOfWord[i]);
        }
        longestWord(root,new StringBuilder(""));
        System.out.println(ans);




    }
}
