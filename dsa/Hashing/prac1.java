package Hashing;

import java.util.*;

public class prac1 {
    public static void main(String args[]){

        HashSet<Integer> set = new HashSet<>();
        
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};

        for(int i = 0 ; i<arr1.length; i++){
            set.add(arr1[i]);

        }

        for(int j = 0 ; j<arr2.length; j++){
            set.add(arr2[j]);

        }

        System.out.print(set);

        


    }
    
}
