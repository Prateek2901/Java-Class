/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_list;

import java.util.ArrayList;

/**
 *
 * @author prateek
 */
public class Array_List {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <Integer> ar= new ArrayList<Integer>();
        int i=0;
        while(i<5)
        {
            ar.add(i);
            i++;
        }
        
        //ar.addAll(ar);
        ar.addAll(2, ar);
        ArrayList <Integer> ar1=(ArrayList <Integer>) ar.clone();
        ar.clear();
        ar1.trimToSize();
        for(int j:ar1)
        {
            System.out.println(j);
        }
        //System.out.print();
    }
    
}
