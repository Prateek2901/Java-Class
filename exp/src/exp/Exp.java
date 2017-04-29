package exp;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;


/**
 *
 * @author prateek
 */
public class Exp 
{


    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        HashMap<Integer,String> hm = new HashMap<>();
        for(int i=0;i<5;i++)
        {
            if(hm.containsKey(i))
            {
                System.out.println("Key is present in the HashMap");
            }
            else
            {
                hm.put(i,sc.next());
            }   
        }
        
        Set <Integer>s = hm.keySet();
        for(int i:s)
        {
            System.out.println(i+"="+hm.get(i));
        }
    }
}
