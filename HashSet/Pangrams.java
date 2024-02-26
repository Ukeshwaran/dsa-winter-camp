package HashSet;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Pangrams {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        HashSet<Character> s=new HashSet<>();
        String srt=sc.next();
        char[] ch=srt.toCharArray();
        for (char c : ch) {
            s.add(c);
        }
        if (s.size()>=26)
            System.out.println("true");
        else 
            System.out.println("false");  
    }
}
