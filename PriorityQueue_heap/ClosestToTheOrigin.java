package PriorityQueue_heap;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ClosestToTheOrigin {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        HashMap<Integer,Integer> h= new HashMap<>();
        for(int i=0;i<n;i++){
            h.put(sc.nextInt(),sc.nextInt());
        }
        int k=sc.nextInt();
        PriorityQueue<Integer> p= new PriorityQueue<>(
            (a,b) -> { int y1=h.get(a);
                     int y2=h.get(b);
                     return ((a*a)+(y1*y1))-((b*b)+(y2*y2));
             } );
        for(Integer x : h.keySet()){
            p.add(x);
        }
        for(int i=0;i<k;i++){
            int r=p.remove();
            System.out.print(r+" ");
            System.out.print(h.get(r));
            System.out.println();
        }
    }
}