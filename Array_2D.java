package com.ridhima;
import java.util.*;

public class Array_2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        for(int i = 0; i<n;i++){
            for(int j = 0; j<m;j++){
                System.out.println("Enter the ["+(i+1)+"]["+(j+1)+"] element: ");
                arr[i][j]=sc.nextInt();
            }
        }

        for(int a=0;a<n;a++){
            System.out.println(Arrays.toString(arr[a]));
        }
    }
}
