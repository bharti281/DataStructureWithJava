package Apna_College;

import java.util.ArrayList;

public class TarjansAlgo {
    static  class Edge
    {
        int src;
        int dest;
        public  Edge(int s ,int d){
            this.src = s;
            this.dest =d;
        }
    }
    public  static  void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i]= new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));

        graph[3].add(new Edge(3,0));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));


    }

    public  static  void  getBridge(ArrayList<Edge> graph[] ,int V){
        int []dt = new int[V];
        int low []  = new int [V];
        int time = 0;
        boolean vis[] = new boolean[V];
        for(int i=0;i<V;i++){
            if(!vis[i]){
                DFS(graph,i,vis,dt,low,time,-1);
            }
        }

    }
    public static void DFS(ArrayList<Edge> graph[], int curr,boolean[] vis, int dt[] , int low[], int time,int parent) {
        vis[curr] = true;
        dt[curr] = low[curr] = ++time;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (e.dest == parent) {
                continue;
            } else if (!vis[e.dest]) {
                DFS(graph, e.dest, vis, dt, low, time, curr);
                low[curr] = Math.min(low[curr], low[e.dest]);
                if (dt[curr] < low[e.dest]) {
                    System.out.println("Bridge is " + curr + " ----> " + e.dest);
                } else {
                    low[curr] = Math.min(low[curr], dt[e.dest]);
                }
            }

        }
    }
    public static void main(String[] args) {

        int V  = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        getBridge(graph,V);


    }


    }
