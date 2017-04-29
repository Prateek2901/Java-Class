/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heap;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 *
 * @author prateek
 */
public class PiorityHeap 
{
    public static void main(String args[])
    {
        PriorityQueue<Integer> minheap=new PriorityQueue<Integer> (1,new Comparator<Integer>(){
        @Override
        public int compare(Integer i1,Integer i2)
        {
            return i1-i2;
        }
    });
    }
}
