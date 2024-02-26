package HashMap;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LuckyInteger {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int li=-1;
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            h.put(a,h.getOrDefault(a, 0)+1);         
        }
        // for(Map.Entry v : h.entrySet()){
        //     if(v.getKey()==v.getValue()){
        //         li=Math.max(li, v.getValue());
        //     }
        // }
        for(Integer x : h.keySet()){
            if(x==h.get(x)){
                li=Math.max(li, x);
            }
        }
        System.out.println(li);
    }
}