/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diameteroftree;

import java.util.Scanner;

/**
 *
 * @author prateek
 */
class Node
{
    int data;
    Node left, right;
    public Node(int data)
    {
        this.data=data;
        left=null;
        right=null;
    }
}
public class DiameterOfTree {

    /** 
     * @param args the command line arguments
     */
    static Node root;
    
    public int diameter(Node root)
    {
        if(root==null)
            return 0;
        
        int lh = height(root.left);
        int rh = height(root.right);
        
        int ld = diameter(root.left);
        int rd = diameter(root.right);
        
        return Math.max(lh+rh+1, Math.max(ld, rd));
    }
    
    public int height(Node root)
    {
        if(root==null)
            return 0;
        
        return Math.max(height(root.left),height(root.right))+1;
    }
    
    private Node insert(int data)
    {
        if(root==null)
            return new Node(data);
        else
        {
            if(root.data>data)
                root.left=insert(data);
            else
                root.right=insert(data);
        }
        return root;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        DiameterOfTree obj = new DiameterOfTree();
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the no of nodes:-");
        int nodes = sc.nextInt();
        for(int i = 0; i < nodes; i++)
        {
            obj.insert(sc.nextInt());
        }
        System.out.println("Height="+obj.height(root));
        System.out.println("Diameter="+obj.diameter(root));
        }
    
}
