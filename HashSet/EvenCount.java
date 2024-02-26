package HashSet;

//to check all elements in string has even count
import java.util.*;
public class EvenCount
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		HashMap<Character,Integer> h = new HashMap<>();
		HashSet<Integer> hs = new HashSet<>();
		String s=sc.next();
		for(int i=0;i<s.length();i++){
            h.put(s.charAt(i),h.getOrDefault(s.charAt(i),0)+1);	    
		}
		boolean flag=false;
		for(Integer x : h.values())
		    hs.add(x);
		    for(Integer x : hs){
		        if(x%2==0)
		            flag=true;
		        else{
		            flag=false;
		            break;
		        }
		    }
		    System.out.println(flag);
}
}

//alternate
// package Hashing.ClassProblems;

// import java.util.*;

// public class FrequencyEqualInStringUsingHashSet {
//     public static void main(String[] args) {
//         String str = "aaaabbccc";
//         HashMap<Character, Integer> map = new HashMap<>();
//         for (int i = 0; i < str.length(); i++) {
//             int count = map.getOrDefault(str.charAt(i), 0);
//             count = (count % 2 == 1) ? 2 : 1; // if the frequency is even time set count = 1 , else count = 2
//             map.put(str.charAt(i), count);
//         }
//         HashSet<Integer> set = new HashSet<>(map.values());
//         System.out.println(set.size() == 1);
//     }
// }