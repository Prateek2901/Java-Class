/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeinterview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author prateek
 */
public class duolicateCharInString {
    public void findDuplicate(String str)
    {
        Map<Character,Integer> dupMap = new HashMap<Character,Integer>();
        char [] charr = str.toCharArray();
        for(Character ch : charr)
        {
            if(dupMap.containsKey(ch))
            {
                dupMap.put(ch, dupMap.get(ch)+1);
            }
            else
            {
                dupMap.put(ch, 1);
            } 
        }
        Set<Character> keys = dupMap.keySet();
        for(Character ch: keys)
        {
           if(dupMap.get(ch)>1)
               System.out.println(ch+"="+dupMap.get(ch)+"times");
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        duolicateCharInString obj = new duolicateCharInString();
        obj.findDuplicate(sc.nextLine());
    }
}
