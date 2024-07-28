package Hashing;
 import java.util.*;

public class hashmap {
    public static void main(String args[]){
        // key and value
        HashMap<String, Integer> map = new HashMap<>();

        map.put("india",120);
        map.put("usa",130);
        map.put("china",150);
        // hashmap are unordered
        // System.out.println(map);

        // System.out.println(map.get("china"));
        // System.out.println(map.get("indonesia"));

        // int arr[]  = {12,15,18};
        // for(int i= 0 ; i<3; i++){
        //     System.out.print(arr[i] + " ");

        // }
        // System.out.println();

        // for(int val : arr){
        //     System.out.print(val+" ");

        // }
        // System.out.println();

        // for(int val : arr)
        for(Map.Entry<String, Integer> e: map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }


    }
}
