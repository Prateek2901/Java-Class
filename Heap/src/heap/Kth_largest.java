/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heap;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author prateek
 */
public class Kth_largest 
{
    public static void main(String args[])
    {
        PriorityQueue<Integer> maxheap=new PriorityQueue<> (1,Collections.reverseOrder());
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the size");
        int n = sc.nextInt();
        int element;
        System.out.println("Element->");
        for(int i=0;i<n;i++)
        {
            element=sc.nextInt();
            maxheap.add(element);
        }
        int k = sc.nextInt();
        for(int i=1;i<=k;i++)
        {
            int x=maxheap.poll();
            if(i==k)
            System.out.println(k+"th Largest Element="+x);
        }
    }
}
