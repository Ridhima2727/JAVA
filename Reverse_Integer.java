package com.ridhima;
import java.util.Scanner;

public class Reverse_Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be reversed: ");
        int n = sc.nextInt();
        int m =0;
        while(n>0){
            int rem = n%10;
            m=m*10+rem;
            n=n/10;
        }
        System.out.printf("The reversed number is %d",m);
    }
}
