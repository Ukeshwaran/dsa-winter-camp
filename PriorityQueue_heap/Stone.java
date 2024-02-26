package PriorityQueue_heap;

//priorityqueue(maxheap) Stone weight
import java.util.*;
public class Stone
{
	public static void main(String[] args) {
	int[] s={2,7,4,1,8,1};
	//int[] s={1,1,1,1};
	PriorityQueue<Integer> p = new PriorityQueue<>(Comparator.reverseOrder());
	for(int st : s){
	    p.add(st);
	}
	while(p.size()>1){
	    int n=(p.remove()-p.remove());
	    if(n!=0){
	        p.add(n);
	    }
	}
	if(!p.isEmpty())
	    System.out.println(p.remove());
	else
	    System.out.println("0");
	}
}
