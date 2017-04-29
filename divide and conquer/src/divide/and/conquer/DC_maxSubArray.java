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
public class DC_maxSubArray {
    public static void main(String args[])
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
        
        System.out.println("Max Sum Array Possible"+maxSubArraySum(ar,0,size-1));
    }
    
    static int max(int a,int b)
    {
        return (a>b)?a:b;
    }
    
    static int max(int a,int b,int c)
    {
        return max(max(a,b),c);
    }
    
    static int maxSubArrayCrossSum(int ar[],int low,int mid,int high)
    {
        int left_sum=Integer.MIN_VALUE,right_sum=Integer.MIN_VALUE;
        
        for(int i = mid,sum=0 ; i >= low ; i--)
        {
            sum+=ar[i];
            
            if(left_sum<sum)
                left_sum=sum;
                    
        }
        
        for(int i = mid+1 ,sum=0 ; i <= high ; i++)
        {
            sum+=ar[i];
            
            if(right_sum<sum)
                right_sum=sum;
                    
        }
        
        return left_sum+right_sum;
    }
    
    static int maxSubArraySum(int ar[],int low, int high)
    {
        if(low==high)
        {
            return ar[low];
        }
        else
        {
            int mid=(low+high)/2;
            return max(maxSubArraySum(ar,low,mid),maxSubArraySum(ar,mid+1,high),maxSubArrayCrossSum(ar,low,mid,high));
        }  
    }
}
