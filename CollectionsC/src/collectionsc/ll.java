/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionsc;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author prateek
 */
public class ll 
{
    public static void main(String args[])
    {
        LinkedList <Integer> l = new LinkedList<Integer>();
        for(int i=0;i<10;i++)
        {
            l.addLast(i);
        }
        Iterator<Integer> i = l.iterator();
        while(i.hasNext())
            System.out.println(i.next());
      
    }
}
