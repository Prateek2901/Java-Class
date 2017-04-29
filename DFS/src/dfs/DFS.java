/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author prateek
 */
public class DFS {

    /**
     * @param args the command line arguments
     */
    private int V;
    private LinkedList<Integer>adj[];
    private boolean marked[];
    private int s;
    private Stack<Integer>st;
    public DFS(int noOfCities ) 
    {
        this.V=noOfCities;
        adj= (LinkedList<Integer>[])new LinkedList[V];
        for(int i = 0 ; i < V; i++)
        {
            adj[i]=new LinkedList<>();
        }
        marked= new boolean[V];
    }
    void addEdge(int s,int d)
    {
        adj[s].add(d);
        adj[d].add(s);
    }
    public Iterable<Integer>adj(int v)
    {
        return adj[v];
    }
    public int V()
    {
        return this.V;
    }
    
    void dfs(int s)
    {
        
        marked[s]=true;
        st.push(s);
        while(!st.empty())
        {
            int v=st.pop();
            System.out.println(v);
            for(int w:adj(v))
            {
            
                if(!marked[w])
                {
                    st.push(w);
                }
            }
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    public static void main(String[] args) 
    {
     Scanner sc = new Scanner (System.in);
     int noOfCities=sc.nextInt();
     int noOfRoads=sc.nextInt();
     DFS d1 = new DFS(noOfCities);
     for(int i=0;i<noOfRoads;i++)
     {
         int start=sc.nextInt();
         int dest=sc.nextInt();
         d1.addEdge(start, dest);
     }
     
     for(int i=1;i<=noOfRoads;i++)
     {
         d1.dfs(i);
     }
     
    }
    
}
