package PriorityQueue_heap;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
//Return the kth largest element in the array
public class KthLargest {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        PriorityQueue<Integer> p = new PriorityQueue<>(Comparator.reverseOrder());
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            p.add(sc.nextInt());
        }
        int k=sc.nextInt();
        int c =p.peek();
        for(int i=0;i<k;i++){
            c = p.remove();
        }
        System.out.println(c);
    }
}
