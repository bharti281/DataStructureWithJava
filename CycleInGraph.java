package Apna_College;

import java.util.ArrayList;
import java.util.Stack;

public class CycleInGraph {
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
        graph[0].add(new edge(0,1));
        graph[0].add(new edge(0,4));

        graph[1].add(new edge(1,0));
        graph[1].add(new edge(1,2));
        graph[1].add(new edge(1,4));


        graph[2].add(new edge(2,1));
        graph[2].add(new edge(2,3));

        graph[3].add(new edge(3,2));

        graph[4].add(new edge(4,0));
        graph[4].add(new edge(4,1));
        graph[4].add(new edge(4,5));

        graph[5].add(new edge(5,4));
    }
    public  static  boolean isCycleUndirected(ArrayList<edge>graph[],boolean[] vist,int curr,int par){
        vist[curr] = true;
        for(int i=0; i<graph[curr].size();i++){
            edge e = graph[curr].get(i);
            if(vist[e.dest]&& e.dest!=par){
                return true;
            }
            else  if(!vist[e.dest]){
                if(isCycleUndirected(graph,vist,e.dest,curr)){
                    return true;
            }
          }
        }
        return false;
    }
    public static void main(String[] args) {

        int V  = 6;
        ArrayList<edge> graph[] = new ArrayList[V];
        createGraph(graph);
        System.out.println(isCycleUndirected(graph,new boolean[V],0,-1));
    }


}
