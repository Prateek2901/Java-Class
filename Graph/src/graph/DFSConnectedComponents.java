/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

/**
 *
 * @author prateek
 */
public class DFSConnectedComponents {
 private boolean [] marked;
    private int s;
    private int id[];
    int count;
    
    DFSConnectedComponents(Graph G)
    {
        marked= new boolean[G.V()];
        id = new int[G.V()];
        for(int i = 0;i < G.V(); i++)
        {
            if(!marked[i])
            {
               dfs(G,i);
               count++;
            }
        }
    }
    private void dfs(Graph G, int v)
    {
        marked[v]=true;
        id[v]=count;
        for(int w:G.adj(v))
        {
            if(!marked[w])
            {
                dfs(G,w);
            }
        }
    }
    public boolean isConnected(int v)
    {
        return marked[v];
    }
    
    public static void main(String args[])
    {
        Graph g = new Graph(13);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 6);
        g.addEdge(0, 5);
        g.addEdge(5, 3);
        g.addEdge(3, 4);
        g.addEdge(4, 6);
        g.addEdge(5, 4);
        
        g.addEdge(7, 8);
        
        g.addEdge(9, 10);
        g.addEdge(9, 11);
        g.addEdge(11, 12);
        g.addEdge(9, 12);
        
        DFSConnectedComponents dfs= new DFSConnectedComponents(g);
        System.out.println(dfs.isConnected(3));
        System.out.println(dfs.isConnected(11));     
    }
}
