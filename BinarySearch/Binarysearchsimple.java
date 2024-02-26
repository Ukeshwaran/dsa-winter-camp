package BinarySearch;

public class Binarysearchsimple {
    public static void main(String[] args) {
        int[] n={10,20,30,40,50,60,70,80,90,100};
        int t = 70;
        System.out.println(binarysearch(n,0,n.length-1,t));
    }
    public static int binarysearch(int[] n,int l,int r,int t) {
    while(l<=r){
        int mid=(l+r)/2;
        if(n[mid]==t)
            return mid;
        else if(t<n[mid])
            r=mid-1;
        else 
            l=mid+1;
    }
    return -1;
    }
}

