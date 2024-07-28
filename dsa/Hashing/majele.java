package Hashing;

import java.util.HashMap;

public class majele {
    public static void majele(int nums[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        // Populate the HashMap with element frequencies
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        // Find and print the majority element(s)
        for (int key : map.keySet()) {
            if (map.get(key) > n / 4) {
                System.out.println(key);
            }
        }
    }

    public static void main(String args[]) {
        int nums[] = { 1, 3, 2, 5, 3, 8,  4 };
        majele(nums);
    }
}
