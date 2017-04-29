/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exp;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author prateek
 */
public class Queues implements Iterable
{
    public static void main(String args[])
    {
        Queue <Integer> q = new LinkedList<>();
        for(int i =0;i<10;i++)
        {
            q.add(i);
        }
        Iterator<Integer> I = q.iterator();
        while(I.hasNext())
            System.out.println(I.next());
    }

    @Override
    public Iterator iterator() {
        return iterator();
    }
}
