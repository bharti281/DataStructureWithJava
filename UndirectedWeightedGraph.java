package Apna_College;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class UndirectedWeightedGraph {
    static  class MyEdge{
        int src;
        int dest;
        int w;
        public  MyEdge(int s ,int d , int w){
            this.src = s;
            this.dest =d;
            this.w = w;
        }

    }

    public  static  void createGraph(ArrayList<MyEdge>graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i]= new ArrayList<>();
        }
        graph[0].add(new MyEdge(0,1,1));
        graph[0].add(new MyEdge(0,2,1));

        graph[1].add(new MyEdge(1,0,1));
        graph[1].add(new MyEdge(1,3,1));

        graph[2].add(new MyEdge(2,0,1));
        graph[2].add(new MyEdge(2,4,1));

        graph[3].add(new MyEdge(3,1,1));
        graph[3].add(new MyEdge(3,4,1));
        graph[3].add(new MyEdge(3,5,1));

        graph[4].add(new MyEdge(4,2,1));
        graph[4].add(new MyEdge(4,3,1));
        graph[4].add(new MyEdge(4,5,1));

        graph[5].add(new MyEdge(5,3,1));
        graph[5].add(new MyEdge(5,4,1));
        graph[5].add(new MyEdge(5,6,1));
        graph[5].add(new MyEdge(6,5,1));

    }
    public  static  void BFS (ArrayList<MyEdge> graph[],int V,boolean vis[],int start){

        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        while (!q.isEmpty()){
            int curr = q.remove();
            if(vis[curr] == false){
                System.out.print(curr+" ");
                vis[curr] = true;
                for (int i=0; i<graph[curr].size(); i++){
                    MyEdge e = graph[curr].get(i);
                    q.add(e.dest);
                }

            }
        }

    }
    public  static  boolean isCycleDirected(ArrayList<MyEdge>[]graph ,boolean visit[],int curr,boolean rec[]){
        visit[curr] = true;
        rec[curr] = true;
        for(int i=0; i<graph[curr].size(); i++) {
            MyEdge e = graph[curr].get(i);
            if (rec[e.dest]) {
                return true;
            } else if (!visit[e.dest]) {
                if (isCycleDirected(graph, visit, e.dest, rec)) {
                    return true;
                }
            }
        }
            rec[curr] = false;
            return false;

    }
    public  static  void DFS(ArrayList<MyEdge> graph[] ,int curr, boolean vist[]){
        if(vist[curr]){
            return;
        }
        System.out.print(curr+" ");
        vist[curr] = true;

        for(int i=0;i<graph[curr].size();i++){
            MyEdge e = graph[curr].get(i);

                DFS(graph,e.dest,vist);

        }
    }
    public static void printAllPath(ArrayList<MyEdge>[]graph, boolean vist[] ,int curr, String path,int tar ){
        if(curr==tar){
            System.out.println(path);
            return;
        }
        for(int i=0; i<graph[curr].size();i++){
            MyEdge e = graph[curr].get(i);
            if(!vist[e.dest]){
                vist[curr] = true;
                printAllPath(graph,vist,e.dest ,path+e.dest,tar);
                vist[curr] = false;
            }
        }

    }



    public static void main(String[] args) {
        int V  = 7;
        ArrayList<MyEdge> graph[] = new ArrayList[V];
        createGraph(graph);

        boolean vis[] = new boolean[V];
        System.out.print("BFS is ");
        for(int i=0; i<V; i++){
           if(vis[i] == false){
               BFS(graph,V,vis,i);
           }
        }
        System.out.println();

        boolean vist[] = new boolean[V];
        System.out.print("DFS is ");
        for(int i=0; i<V; i++){
            if(vist[i] == false){
                DFS(graph,0, vist);
            }
        }
        int src = 0;
       int tar = 5;
       boolean vi[] = new boolean[V];
       vi[src] = true;

        System.out.println();
//        (ArrayList<MyEdge>[]graph, boolean vist[] ,int curr, String path,int tar )
        printAllPath(graph,vi,src,""+src,tar);
        System.out.println(isCycleDirected(graph,new boolean[V],0,new boolean[V]));



    }
}
