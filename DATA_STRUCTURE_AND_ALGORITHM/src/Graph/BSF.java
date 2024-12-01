/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author khushi pandey
 */
public class BSF {

   static class graph{
       int src;
       int dest;
       int wgt;
       graph(int s,int d,int w){
           this.src = s;
           this.dest = d;
           this.wgt = w;
       }
   }
   public static void CreateGraph(ArrayList<graph> g[]){
       for(int i = 0;i < g.length;i++){
           g[i] = new ArrayList<graph>();
       }
       // Adding edges (undirected graph: add both src -> dest and dest -> src)
        g[0].add(new graph(0, 1, 3));
        
        g[1].add(new graph(1, 3, 2)); // Reverse edge (undirected graph)
        g[1].add(new graph(1, 0, 3)); // Reverse edge (undirected graph)
        g[1].add(new graph(1, 2, -10)); // Reverse edge (undirected graph)
        g[1].add(new graph(1, 4, 6));

        g[2].add(new graph(2, 7, 9));
        g[2].add(new graph(2, 3, 90)); // Reverse edge (undirected graph) 
        g[2].add(new graph(2, 1, -10));

        g[3].add(new graph(3, 1, 2));
        g[3].add(new graph(3, 2, 90));
        
        g[4].add(new graph(4, 1, 6)); // Reverse edge (undirected graph)
        
        g[7].add(new graph(7, 2, 9)); // Reverse edge (undirected graph)
        
   }
   public static void bfs(ArrayList<graph> g[],int v){
       Queue<Integer> q = new LinkedList<>();
       boolean[] vis = new boolean[v];
       q.add(0);
       while(!q.isEmpty()){
           int cur = q.remove();
           if(vis[cur]==false){
               System.out.println(cur + " ");
               vis[cur] = true;
               for(int i = 0;i < g[cur].size();i++){
                   graph e = g[cur].get(i);
                   q.add(e.dest);
               }
           }
       }
        
   }
    public static void main(String[] args) {
         int v = 8;
        ArrayList<graph> graph[] = new ArrayList[v];
        CreateGraph(graph);
//        print neighbour
//        for(int i = 0;i < graph[2].size();i++){
//            graph e = graph[2].get(i);
//            System.out.println(e.dest+" , "+e.wgt);
//            
//        }
        bfs(graph,v);
    }
    
}
