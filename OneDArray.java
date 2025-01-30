package bhagirath;

import java.util.Scanner;

public class OneDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        int n = sc.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        System.out.println("The elements of the array are:");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        
        }
    }
}
