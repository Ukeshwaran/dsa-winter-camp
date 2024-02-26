package PriorityQueue_heap;

//find k frequent elements
import java.util.*;
public class KFrequentElements
{
	public static void main(String[] args) {
	int[] arr = {10,10,10,20,20,30};
	HashMap<Integer,Integer> h=new HashMap<>();
	PriorityQueue<Integer> p = new PriorityQueue<>();
	//PriorityQueue<Integer> max = new PriorityQueue<>(Comparator.reverseOrder());
	int k=2;
	for(Integer x :arr){
	    h.put(x,h.getOrDefault(x,0)+1);
	   	}
	for(Integer x :h.keySet()){
	    p.add(x);
	    if(p.size()>k)
	        p.remove();
	    }
	for(int i=0;i<k;i++){
	    System.out.println(p.remove());
	}
}
}
