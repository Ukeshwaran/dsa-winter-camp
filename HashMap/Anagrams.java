package HashMap;

import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> h=new HashMap<>();
        if(s.length()==t.length()){
	    for(int i=0;i<s.length();i++){
	        h.put(s.charAt(i),h.getOrDefault(s.charAt(i),0)+1);
	    }
	    for(int i=0;i<s.length();i++){
	        if(h.containsKey(t.charAt(i))){
                if(h.get(t.charAt(i))==1)
	                h.remove(t.charAt(i));
                else
                    h.put(t.charAt(i),h.get(t.charAt(i))-1);
            }
            else return false;
	    }
         if(h.size()==0) 
            return true;
         else 
            return false;
	    }
       else{
           return false;
       }
    }
}
