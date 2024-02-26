package HashMap;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EqualNoOf {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        HashMap<Integer,Integer> h = new HashMap<>();
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int l=0,ans=0,c=0;
        for(int r=0;r<n;r++){
           int i=sc.nextInt();
           h.put(i,h.getOrDefault(i, 0)+1);
        }
        if(h.get(1)==h.get(0))
            System.out.println(2*h.get(1)); 
        else{
            int min=Math.min(h.get(1),h.get(0));
            System.out.println(min+1);
        }
    }
}