/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divide.and.conquer;

import java.util.Scanner;

/**
 *
 * @author prateek
 */
public class Max_SubArray_Sum {
    public static void main(String []args)
    {
        int size;
        int ar[];
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter the Size of Array");
        size=sc.nextInt();
        
        ar = new int[size];
        
        for(int i = 0 ; i < size ; i++)
        {
            ar[i]=sc.nextInt();
        }
        
        System.out.println("Max Sum Array Possible"+maxSubArraySum(ar));
    }
    
    static int maxSubArraySum(int ar[])
    {
        int maxSumPossible=Integer.MIN_VALUE,maxSum=0;
        for(int i = 0 ; i < ar.length ; i++)
        {
            maxSum+=ar[i];
            
            if(maxSum<0)
                maxSum=0;
            else 
                if(maxSum>maxSumPossible)
                    maxSumPossible=maxSum;
        }
        return maxSumPossible;
    }
}
