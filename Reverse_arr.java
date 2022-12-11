package com.ridhima;
import java.util.*;
public class Reverse_arr {
    public static void main(String[] args) {
        int[] arr ={1,2,5,8,4,5};
        System.out.println(reverse(arr));
    }

    static String reverse(int arr[]){
        int n = arr.length;
        int[] revarr = new int[n];
        for(int i =0;i<n;i++){
            revarr[i]=arr[n-1-i];
        }
        return Arrays.toString(revarr);
    }
}
