/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import java.util.LinkedList;

public class Graph {

    private final int V;
    private LinkedList<Integer> adj[];
       Graph(int V)
       {
           this.V = V;
           adj=(LinkedList<Integer>[])new LinkedList[V];
           for(int i = 0; i < V; i++)
           {
               adj[i]=new LinkedList<Integer>();
           }
       }
       public void addEdge(int v, int w)
       {
           adj[v].add(w);
           adj[w].add(v);
       }
       public Iterable<Integer>adj(int v) //Iterable is an interface and Class LINKLIST implements the interface
       {                                  //In this "Iterable" i = new LinkedList(); 
           return adj[v];
       }
       public int V()
       {
           return this.V;
       }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
