/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;
import java.util.Scanner;

/**
 *
 * @author prateek
 */
class Node
{
    int data;
    Node left;
    Node right;
    
    public Node()
    {
        left = null;
        right = null;
        data = 0;
    }
    
    public Node(int n)
    {
        left = null;
        right = null;
        data = n;
    }
    
}

public class Tree {

    /**
     * @param args the command line arguments
     */
    
    private static Node root;
    
    Node insert(Node root,int data)
    {
        if(root == null)
        {
            root = new Node(data);
        }
        else
        {
            if(root.data>data)
                root.left=insert(root.left,data);
            else
                root.right=insert(root.right,data);
        }
        return root;
    }
    
    void inOrder(Node root)
    {
        if(root!=null)
        {
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
        }
    }
    void preOrder(Node root)
    {
        if(root!=null)
        {
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
        }
    }
    void postOrder(Node root)
    {
        if(root!=null)
        {
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
        }
    }
    void findAncestors(int ar[][],Node root)
    {
        while(root!=null)
        {
            ar[root.left.data][root.data]=1;
            ar[root.right.data][root.data]=1;
            
            for(int i = 0; i < ar[0].length; i++)
            {
                if(ar[root.data][i]==1)
                {
                    ar[root.left.data][i]=1;
                    ar[root.right.data][i]=1;
                }
            }
            
            findAncestors(ar,root.left);
            findAncestors(ar,root.right);
        }
    }
    
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Tree obj = new Tree();
        Scanner sc = new Scanner(System.in);
        int noOfNodes=sc.nextInt();
        for(int i = 0; i < noOfNodes ; i++)
        {
            root=obj.insert(root, sc.nextInt());
        }
        
        int ar[][] = new int[noOfNodes][noOfNodes];
        obj.findAncestors(ar,root);
        
        for(int i = 0 ; i < noOfNodes ; i++)
        {
         for(int j = 0 ; j < noOfNodes ; j++)
            {
                System.out.print(ar[i][j]+" ");
            }
                         System.out.println();            
        }
        
        //obj.inOrder(root);
        
        
        
    }
    
}
