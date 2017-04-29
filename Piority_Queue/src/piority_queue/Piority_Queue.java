/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piority_queue;


import java.util.Collections;
import java.util.PriorityQueue;

/**
 *
 * @author prateek
 */
public class Piority_Queue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        System.out.println(pq.isEmpty());
        for(int i=0;i<10;i++)
            pq.add(i);
        System.out.println(pq.contains(9));
        System.out.println(pq.size());
        
        System.out.print(pq.peek());
        
        //System.out.println(pq.contains(10));
    }
    
}
