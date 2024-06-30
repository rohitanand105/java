package dsa.array;

public class dup {
    public static void main(String args[]) {
        int a[] = { 1, 8, 6, 4, 7, 12, 85, 36, 52 };

        // sort the array in sorted form using selection sort
        for (int i = 0; i < a.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[smallest] > a[j]) {
                    smallest = j;

                }

            }
            int temp = a[smallest];
            a[smallest] = a[i];
            a[i] = temp;

        }
        boolean hasdup = false;

        for(int i = 0 ; i<a.length-1; i++){
            if(a[i] == a[i+1]){
                hasdup = true;
                break;

            }

        

        }
        System.out.println(hasdup);



    }

}
