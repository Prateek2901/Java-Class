/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binaryknapsack;

import java.util.Scanner;

/**
 *
 * @author prateek
 */
public class BinaryKnapsack {

    /**
     * @param args the command line arguments
     */
    
    void display(int ar[][],int count)
    {
        for(int i =  1 ; i <= count ; i++ )
        {
           
                System.out.println(ar[i][1]+"->"+ar[i][2]);
        }
    }
    
    int knapsack(int count,int size,int value[],int weight[])
    {
        int p[][]= new int [count+1][size+1];
        for(int i=1;i<count+1;i++)
        {
            for(int j=1;j<size+1;j++)
            {
                if(weight[i]>j)
                {
                    p[i][j]=p[i-1][j];
                }
                else
                {
                    p[i][j] = Math.max(p[i-1][j] , value[i]+p[i-1][j-weight[i]] );
                }
            }
        }
        return p[count][size];
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        BinaryKnapsack obj = new BinaryKnapsack();
        int objectCount = sc.nextInt();
        int sackSize = sc.nextInt();
        
        int value[] = new int [objectCount+1]; 
        int weight[] = new int [objectCount+1];
        
        for(int i =  1 ; i <= objectCount ; i++ )
        {
            
                value[i]=sc.nextInt();
                weight[i]=sc.nextInt();
        }
        //obj.display(profit,objectCount);
        System.out.println(obj.knapsack(objectCount, sackSize, value,weight));
    }
    
}
