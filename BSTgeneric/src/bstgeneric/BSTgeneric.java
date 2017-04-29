/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bstgeneric;

/**
 *
 * @author prateek
 */

public class BSTgeneric<K extends Comparable> {

    /**
     * @param args the command line arguments
     */
   Node root;
   class Node
   {
       K key;
       Node left;
       Node right;
       
       public Node(K key)
       {
          this.key=key;
          this.left=this.right=null;
       }
   }
   
    public static void main(String[] args) 
    {
        // TODO code application logic here
    }
    
}
