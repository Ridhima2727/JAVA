package com.ridhima;
import java.util.Scanner;

public class Prime_Number_Method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(prime(n));
    }

    static boolean prime(int m){
        if(m<=1) {
            return false;
        }
        int i=2;
        while(i*i<=m){
            if(m%i==0){
                return false;
            }
            i++;
        }
        return true;
        }
    }

