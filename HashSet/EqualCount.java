package HashSet;

//to check all elements in string has equal count
import java.util.*;
public class EqualCount
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		HashMap<Character,Integer> h = new HashMap<>();
		HashSet<Integer> hs = new HashSet<>();
		String s=sc.next();
		for(int i=0;i<s.length();i++){
            h.put(s.charAt(i),h.getOrDefault(s.charAt(i),0)+1);	    
		}
		for(Integer x : h.values())
		    hs.add(x);
		if(hs.size()==1)
		    System.out.println("true");
		else
		    System.out.println("false");
	}
}
