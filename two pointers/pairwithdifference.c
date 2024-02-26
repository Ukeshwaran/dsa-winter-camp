#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    int p;
    scanf("%d",&p);
    while(p>0){
        int q,r;
        int i=0,j=i+1,flag=0;
        scanf("%d",&q);
        int arr[q];
        for(int i=0;i<q;i++){
            scanf("%d",&arr[i]);
        }
        scanf("%d",&r);
        while(j<q){
        if(arr[j]-arr[i]==r){
            flag=1;
            break;
        }
        else if(arr[j]-arr[i]<r){
            j++;
        }
        else{
            i++;
        }
    }
    if(!flag){
        printf("%d\n",flag);
    }
    else{
        printf("%d\n",flag);
    }
    p--;
    }
    return 0;
}
