/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author prateek
 */
public class Threads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException, IOException {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        String keyword = sc.nextLine();
        URL GOOGLE_SEARCH = new URL("https://www.google.co.in/search?q="+keyword);
        System.out.println(GOOGLE_SEARCH);
       /* BufferedReader br = new BufferedReader(
        new InputStreamReader(GOOGLE_SEARCH.openStream()));

        String inputLine;
        while ((inputLine = br.readLine()) != null)
            System.out.println(inputLine);
        br.close();*/
    }
    
}
