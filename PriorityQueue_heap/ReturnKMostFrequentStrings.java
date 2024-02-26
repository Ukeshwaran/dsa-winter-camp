package PriorityQueue_heap;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ReturnKMostFrequentStrings {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        HashMap<String,Integer> h= new HashMap<>();
        PriorityQueue<String> p = new PriorityQueue<>(
            (a,b) -> { int ca= h.get(a);
                       int cb= h.get(b);
                       if(ca==cb){
                           return a.compareTo(b);
                       }
                       return cb-ca;
                    });
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int k= sc.nextInt();
        for(String x : s){
            h.put(x, h.getOrDefault(x, 0)+1);
        }
        for(String x : h.keySet()){
            p.add(x);

        }
        for(int i=0;i<k;i++){
            System.out.print(p.remove()+" ");
        }
    }
}