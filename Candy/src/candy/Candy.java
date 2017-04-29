/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package candy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
*
* @author prateek
*/
public class Candy 
{

public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt(); //No Of Candies

        int p = sc.nextInt(); // Pth Largest Factor
        
        ArrayList <Integer> ar = new ArrayList<Integer>();
        
        for(int i=1;i<=Math.sqrt(m)+1;i++)
        {
           if(m%i==0)
           {
               if(m/i==i)
               { 
                   System.out.print(i+" ");
                   ar.add(i);
               }
               else
               {
                   System.out.print(i+" "+m/i+" ");
                   ar.add(i);
                   ar.add(m/i);
               }
           }
        }
        System.out.println();
        Collections.sort(ar);
        Iterator <Integer>i = ar.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }

}
