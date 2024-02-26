package PriorityQueue_heap;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//givena an array of sticks of length combine two sticks of highest length and add their price back to array until one stick is left

public class Removetwo {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        PriorityQueue<Integer> p = new PriorityQueue<>();
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            p.add(sc.nextInt());
        }
        int price=0;
        while(p.size()>1){
            int m = p.remove()+p.remove();
            price+=m;
            p.add(m);
        }
        System.out.println(price);
    }
}
