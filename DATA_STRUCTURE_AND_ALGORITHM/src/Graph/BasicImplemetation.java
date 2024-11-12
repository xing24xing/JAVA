/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Graph;

import java.util.ArrayList;

/**
 *
 * @author khushi pandey
 */
public class BasicImplemetation {

   static class Edge{
//       int src;
//       int dest;
//       public Edge(int s,int d){
//           this.src = s;
//           this.dest = d;
//       }
        int src;
       int dest;
       int wt;
       public Edge(int s,int d,int w){
           this.src = s;
           this.dest = d;
           this.wt = w;
       }
   }
   public static void CreateGraph(ArrayList<Edge> graph[]){
       for(int i = 0;i < graph.length;i++){
           graph[i] = new ArrayList<Edge>();
       }
       graph[0].add(new Edge(0,2,2));
       graph[1].add(new Edge(1,2,10));
       graph[1].add(new Edge(1,3,0));
       graph[2].add(new Edge(2,0,2));
       graph[2].add(new Edge(2,1,10));
       graph[2].add(new Edge(2,3,-1));
       graph[3].add(new Edge(3,1,-1));
       graph[3].add(new Edge(3,2,0)); 
       
   }
    public static void main(String[] args) {
        // TODO code application logic here
        int v = 4;
        ArrayList<Edge> graph[] = new ArrayList[v];
        CreateGraph(graph);
//        print neighbour
        for(int i = 0;i < graph[2].size();i++){
            Edge e = graph[2].get(i);
            System.out.println(e.dest+" , "+e.wt);
            
        }
    }
    
}
