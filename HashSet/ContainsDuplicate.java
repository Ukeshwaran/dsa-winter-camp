package HashSet;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ContainsDuplicate {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        HashSet<Integer> s = new HashSet<>();
        for(int i=0;i<n;i++){
            s.add(sc.nextInt());
        }
        boolean flag = (s.size()<n)? true :false;
        System.out.println(flag);
    }
}