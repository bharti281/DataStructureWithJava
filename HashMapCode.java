package Apna_College;
import java.util.*;

public class HashMapCode {
    static  class HashMap<K,V> {
        private  class Node{
            K key;
            V value;
            public  Node(K key , V value){
                this.key = key;
                this.value = value;
            }
        }
        private  int n ;
        private  int N;
       private  LinkedList<Node> buckets[];
        public  HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i=0;i<4; i++){
                this.buckets[i] = new LinkedList<>();
            }
        }
        private int hashfunction(K key){
            int bi = key.hashCode();
            return Math.abs(bi)%N;
        }
        private  int searchInLL(K key ,int bi){
            LinkedList<Node> ll = buckets[bi];
            for (int i=0;i<ll.size(); i++){
                if(ll.get(i).key==key){
                    return  i;
                }
            }
            return  -1;
        }
       private void rehash(){
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N*2];
            for(int i=0; i<N*2; i++){
                buckets[i] = new LinkedList<>();
            }
            for(int i=0; i<oldBucket.length;i++){
                LinkedList<Node> ll = oldBucket[i];
                for (int j=0; j<ll.size();j++){
                    Node node = ll.get(j);
                    put(node.key ,node.value);
                }

            }
       }

        public void put (K key , V value){
            int bi = hashfunction(key);
            int di = searchInLL(key ,bi);
            if(di == -1){
                buckets[bi].add(new Node(key,value));
                n++;
            }
            else {
                Node node = buckets[bi].get(di);
                node.value = value;
            }
            double lambda = (double)n/N;
            if(lambda >2.0){
                rehash();
            }
        }
        public  boolean containsKey(K key){
            int bi = hashfunction(key);
            int di = searchInLL(key ,bi);
            if(di == -1){
                return  false;
            }
            else {
                return true;
            }
        }
        public V remove (K key){
            int bi = hashfunction(key);
            int di = searchInLL(key ,bi);
            if(di == -1){
                return  null;
            }
            else {
                Node node = buckets[bi] .remove(di);
                n--;
                return node.value;
            }

        }
        public V get (K key){
            int bi = hashfunction(key);
            int di = searchInLL(key,bi);
            if(di == -1){
                return  null;
            }else {
                Node node = buckets[bi].get(di);
                return  node.value;
            }

        }
        public  ArrayList<K> keyset(){
            ArrayList<K> keys =new ArrayList<>();
            for(int i=0; i<buckets.length; i++){
                LinkedList<Node> ll = buckets[i];
                for(int j=0; j<ll.size();j++){
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public  boolean isEmpty(){
            return  n==0;
        }
    }


    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("India",190);
        map.put("China",200);
        map.put("Us",50);
        ArrayList<String> keys = map.keyset();
        for(int i=0; i<keys.size();i++){
            System.out.println(keys.get(i)+ " " +map.get(keys.get(i)));
        }
        map.remove("India");
        System.out.println("After removing the india try to find india ");
        System.out.println(map.get("India"));
        System.out.println(map.keyset());
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("India"));
    }
}
