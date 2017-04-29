package collectionsc;

import java.util.Collections;
import java.util.Vector;

public class vector {

    public static void main(String[] args) 
    {
        Vector<Integer> v = new Vector<Integer>();
        for(int i=10;i>0;i--)
            v.add(i);
        
        Collections.sort(v);
        for(int i:v)
            System.out.println(i);
        v.remove(0);
        System.out.println(v.toString());
    }
    
}
