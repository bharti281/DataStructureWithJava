package Apna_College;

import java.util.ArrayList;
import java.util.Stack;

public class TopoLOgicalSort {
    static  class edge
    {
        int src;
        int dest;
        public  edge(int s ,int d){
            this.src = s;
            this.dest =d;
        }
    }
    public  static  void createGraph(ArrayList<edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i]= new ArrayList<edge>();
        }
        graph[2].add(new edge(2,3));
        graph[3].add(new edge(3,1));

        graph[4].add(new edge(4,0));
        graph[4].add(new edge(4,1));

        graph[5].add(new edge(5,0));
        graph[5].add(new edge(5,2));


    }
    public  static  void topoLogicalSort(ArrayList<edge> graph[] ,int curr, boolean vis[], Stack<Integer> stack ){
        vis[curr] = true;
        for(int i=0; i<graph[curr].size();i++){
            edge e = graph[curr].get(i);
           if(!vis[e.dest]){
            topoLogicalSort(graph,e.dest,vis,stack);
           }
        }
        stack.push(curr);
    }
    public static  void topSort(ArrayList<edge> graph[] ,int V){
        boolean vis[] = new boolean[graph.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<V; i++){
            if(!vis[i]){
                topoLogicalSort(graph,i,vis,stack);
            }
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }

    }
    public static void main(String[] args) {

        int V  = 6;
        ArrayList<edge> graph[] = new ArrayList[V];
        createGraph(graph);
//        for (int i=0;i<graph[2].size();i++){
//            edge e= graph[2].get(i);
////            System.out.println(e.dest+" ");
//        }
        topSort(graph,V);
    }

}
