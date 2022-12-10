package com.ridhima;
import java.util.Scanner;

public class Counting_Occurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Enter the number to check no. of occurrences: ");
        int m = sc.nextInt();
        int count =0;
        while(n>0){
            int rem = n %10;
            if (rem == m){
                count++;
            }
            n=n/10;
        }
        System.out.printf("%d occurs %d times.\n",m,count);
    }
}
