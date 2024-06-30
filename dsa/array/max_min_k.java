package dsa.array;

import java.util.Scanner;
import java.util.Arrays;

public class max_min_k {
    public static void main(String args[]) {
        int a[] = new int[5];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the values of array");
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();

        }
        System.out.println("this is the actual array");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        int k = 2;
        Arrays.sort(a);
        System.out.println("This is the sorted array");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        System.out.println("This is the K th element of array");

        System.out.println(a[a.length - k]);

        scan.close();

    }

}
