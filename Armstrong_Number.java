package com.ridhima;
import java.util.Scanner;
public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(checkarm(n));
    }

    static boolean checkarm(int m){
        int c=m;
        int var=0;
        while(m>0){
            var+=Math.pow((m%10),3);
            m=m/10;
        }
        return var==c;

    }
}
