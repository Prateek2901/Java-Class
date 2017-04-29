/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exp;

import java.util.Comparator;
import java.util.Scanner;

public class cmp implements Comparator
{    
    public static String st1 = "Hello";
    public static String st2 = "Hell";
    public static void main(String args[])
    {
        cmp p = new cmp();
       System.out.print(p.compare(st1,st2));
    }

    @Override
    public int compare(Object o1, Object o2) {
        return o2.equals(o1)?1:0;
    }

    
}
