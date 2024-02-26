package HashSet;

import java.util.*;
public class TargeSum
{
public static void main(String[] args) {
int[] nums={5,19,8,1};
double sum=0;
PriorityQueue<Double> heap=new PriorityQueue<>(Comparator.reverseOrder());
for(double num:nums){
   heap.add(num);
   sum+=num;
}
double target=sum/2;
int c=0;
while(target>0){
   double half=heap.remove()/2;
   heap.add(half);
   c++;
            target=target-half;
       
}
System.out.println(c);

}
}