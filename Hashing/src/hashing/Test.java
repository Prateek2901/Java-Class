package hashing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Set;
import java.util.StringTokenizer;

/**
 *
 * @author prateek
 */
public class Test 
{
    public static void main(String args[]) throws IOException
    {
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        File file = new File("/home/prateek/NetBeansProjects/Hashing/src/hashing/input.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        String line = null;
        while((line=br.readLine())!=null)
        {
            StringTokenizer str= new StringTokenizer(line," ");
            while(str.hasMoreTokens())
            {
                //System.out.println(str.nextToken());
                String token=str.nextToken();
                if(!hm.containsKey(token))
                {
                    hm.put(token, 1);
                }
                else
                {
                    hm.put(token,hm.get(token)+1);
                }
            }
        }
        Set<String>s= hm.keySet();
        for(String i:s)
        {
            System.out.println(i+"="+hm.get(i)+"times");
        }
    }
}