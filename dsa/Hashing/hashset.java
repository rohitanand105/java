package Hashing;

import java.util.*;

public class hashset {

    public static void main(String args[]) {
        // Creating
        HashSet<Integer> set = new HashSet<>();

        // Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1); // Set does not allow duplicates

        // Size

        System.out.println("Size of set is: " + set.size());

        // Search - contains
        // if (set.contains(1)) {
        //     System.out.println("Set contains 1");
        // }
        // if (set.contains(6)) {
        //     System.out.println("Does not contain 1");
        // }

        // // Delete
        // set.remove(1);
        // if (!set.contains(1)) {
        //     System.out.println("Set does not contains 1");
        // }

            // To print all elements of set.
            System.out.println(set);
        // Iterator
        Iterator it = set.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
            
        }

    }

}
