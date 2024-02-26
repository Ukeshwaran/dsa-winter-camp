package PriorityQueue_heap;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
//given an array remove the floor value of max element /2 for k times.
public class RemoveNbyTwoForKtimes {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        PriorityQueue<Double> p = new PriorityQueue<>(Comparator.reverseOrder());
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            double j=sc.nextInt();
            p.add(j);
        }
        int k=sc.nextInt();
        double c=0;
        for(int i=0;i<k;i++){
            double r= p.remove();
            double h=Math.floor(r/2);
            p.add(r-h);
        }
        double sum=0;
         for(int i=0;i<n;i++){
           sum+=p.remove();
        }
        System.out.println((int)sum);
    }
}