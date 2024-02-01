package Apna_College;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class DijkstrasAlgo {
    static  class Edge{
        int src;
        int dest;
        int w;
        public  Edge(int s ,int d , int w){
            this.src = s;
            this.dest =d;
            this.w = w;
        }

    }
    public  static  void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i]= new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,3,7));

        graph[1].add(new Edge(1,2,1));

        graph[2].add(new Edge(2,4,3));

        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,3,2));
        graph[4].add(new Edge(4,5,5));

    }

    public  static  class pair implements  Comparable<pair>{
        int node ;
        int dist;

        public  pair(int n , int d){
            this.node = n;
            this.dist = d;
        }
        @Override
        public int compareTo(pair p2) {
           return  this.dist - p2.dist;
        }
    }
    private static int[] dijkstra(ArrayList<Edge>[] graph, int src) {
        PriorityQueue <pair> pq = new PriorityQueue<pair>();
        int dist [] = new int[graph.length];
        boolean vis[] = new boolean[graph.length];
        for(int i=0;i<dist.length;i++){
            if(i!=src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        pq.add(new pair(src,0));
        while (!pq.isEmpty()){
            pair curr =pq.remove();
            if(!vis[curr.node]){
                vis[curr.node] = true;
                for (int i=0;i<graph[curr.node].size();i++){
                    Edge e = graph[curr.node].get(i);
                    int u = e.src;
                    int v= e.dest;
                    if(!vis[v]&& dist[u]+e.w<dist[v]){
                        dist[v] = dist[u] + e.w;
                        pq.add(new pair(v,dist[v]));
                    }
                }
            }
        }
        return  dist;
    }
    public static void main(String[] args) {
        int V= 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        int src = 0;
        int dist [] = dijkstra(graph,src);
        for(int i=0; i< dist.length;i++){
            System.out.print(dist[i]+" ");
        }

    }


}
