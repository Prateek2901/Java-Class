/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bfs;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;


public class BFS {

    
    
    void bfsTraversal(boolean G[][],int startingNode,int nodes)
    {
        Queue <Integer> Q = new <Integer> LinkedList(); 
        Q.add(startingNode);
        boolean visitedNode[] = new boolean[nodes+1]; 
        visitedNode[startingNode]=true;
        while(!Q.isEmpty())
        {
            int vertex = Q.poll();
            System.out.println(vertex);
            for(int i = 1 ; i <=nodes; i++)
            {
                if(G[vertex][i]==true)
                {
                    if(visitedNode[i]==false)
                    {
                        Q.add(i);
                        visitedNode[i]=true;
                    }
                }
            }
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);        
        int noOfNodes= sc.nextInt();
        boolean adjMatrix[][] = new boolean [noOfNodes][noOfNodes];
        int noOfEdges = sc.nextInt();
        for(int i = 0 ; i < noOfEdges; i++)
        {
            System.out.println("Enter the source and destination");
            int sourceNode = sc.nextInt();
            int destinationNode = sc.nextInt();
            adjMatrix[sourceNode][destinationNode] = true;
            adjMatrix[destinationNode][sourceNode] = true;
        }
        System.out.println("Enter the starting node=");
        int start = sc.nextInt();
        BFS obj = new BFS();
        obj.bfsTraversal(adjMatrix,start,noOfNodes);
        
    }
    
}
