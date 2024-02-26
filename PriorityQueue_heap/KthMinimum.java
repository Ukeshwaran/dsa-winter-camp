package PriorityQueue_heap;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class KthMinimum {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        PriorityQueue<Integer> p = new PriorityQueue<>();
        for(int i=0;i<n;i++){
            p.add(sc.nextInt());
        }
        int r=0;
        int k=sc.nextInt();
        for(int i=0;i<k;i++){
            r=p.remove();
        }
        System.out.println(r);
    }
}