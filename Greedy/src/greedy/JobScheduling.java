/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greedy;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author prateek
 */
class Job
{
    char id;
    int deadline;
    int profit;
    public Job(char id,int deadline,int profit)
    {
        this.id=id;
        this.deadline=deadline;
        this.profit=profit;
    }
}
public class JobScheduling {
    boolean comparison(Job a,Job b)
    {
        return (a.profit>b.profit);
    }
    void Schedule(Job ar[],int n)
    {
        
    }
    public static void main(String args[])
    {
       Scanner sc = new Scanner (System.in); 
       int noOfJobs = sc.nextInt();
       Job obj[] = new Job[noOfJobs];
       for(int i = 0; i < noOfJobs; i++)
       {
           char id = sc.next(".").charAt(0);
           int deadline = sc.nextInt();
           int profit = sc.nextInt();
           obj[i]=new Job(id,deadline,profit);
       }
       
       Arrays.sort(obj);
       
       for(Job ob:obj)
       {
           System.out.println(ob.id);
           System.out.println(ob.deadline);
           System.out.println(ob.profit);
       }
       
    }
}
