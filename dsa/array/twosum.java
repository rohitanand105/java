package dsa.array;

public class twosum {
    public static void main(String args[]) {

        int a[] = { 1, 2, 4, 3, 5, 7, 6, 8, 9, };
        int target = 6;

        for (int i = 0; i < a.length; i++) {
            for(int j = i+1; j<a.length;j++){
                if(a[i] + a[j] == target){
                    System.out.println("Pair: (" + a[i] + ", " + a[j] + ")");

                }

            }
        }

    }
}
