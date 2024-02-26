package HashMap;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ContainsIplusOne {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer> hm=new HashMap<>();
        int n=sc.nextInt();
        int c=0;
        for(int i=0;i<n;i++){
            hm.put(sc.nextInt(), null);
        }
        for (Integer i : hm.keySet()) {
            if(hm.containsKey(i+1)) c++;
        }
        System.out.println(c);
    }
}