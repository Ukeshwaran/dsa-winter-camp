package HashSet;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Duplicates {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> s=new HashSet<>();
        int n=sc.nextInt();
        for (int i=0;i<n;i++) {
            s.add(sc.nextInt());
        }
        if (s.size()<n)
            System.out.println("true");
        else 
            System.out.println("false");  
    }
    }