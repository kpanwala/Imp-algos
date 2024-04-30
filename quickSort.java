// YT link: https://www.youtube.com/watch?v=7h1s2SojIRw&ab_channel=AbdulBari

import java.io.*;
import java.util.*;

class QuickSort {
    
    static void quickSort(int [] arr, int l, int h){
        if(l<h){
            int p = partition(arr, l, h);
            
            quickSort(arr, l, p);
            quickSort(arr, p+1, h);
        }
    }
    
    static int partition(int [] arr, int l, int h){
        int pivot = arr[l];
        int i=l-1,j=h;
        
        while(i<j){
            do{
                i++;
            }while(i<h && arr[i]<=pivot);
            
            do{
                j--;
            }while(j>l && arr[j]>pivot);
            
            if(i<j){
                swap(arr,i,j);
            }
        }
        swap(arr,l,j); // swapping pivot which is l (Ref: line 18)
        
        return j; // returning j (pivot)
    }
    
    static void swap(int arr[], int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    
    public static void main(String[] args) {
        int arr[]={10, 7, 8, 9, 1, 5};
        quickSort(arr,0,arr.length);
        Arrays.stream(arr).forEach(str->System.out.print(str+" "));
    }
}
