package com.ridhima;
import java.util.*;
public class Max_Array_Val {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i=0; i<n ;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(max(arr));
    }

    static int max(int[] arr){
        Arrays.sort(arr);
        int l =arr.length-1;
        return arr[l];
    }
}
