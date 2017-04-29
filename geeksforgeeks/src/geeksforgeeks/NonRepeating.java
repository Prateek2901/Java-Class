/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geeksforgeeks;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author prateek
 * First non-repeating character in a stream
hashing
* Link:- http://practice.geeksforgeeks.org/problems/first-non-repeating-character-in-a-stream/0
*/
public class NonRepeating {
    public static void main(String args[])
    {
        ArrayList <Character> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int l=len;
        while(l--!=0)
        {
            char ch = sc.nextLine().charAt(0);
            if(l!=len && al.isEmpty())
                System.out.println(-1);
            if(!al.contains(ch))
            {
                al.add(ch);
            }  
            else
            {
                al.remove(ch);
            }
        }
    }
    
}
