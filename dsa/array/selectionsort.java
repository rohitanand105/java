package dsa.array;

public class selectionsort {
    public static void main(String args[]){
        int a[] = {75,28,23,78,158,933,752,7,86,93};
        System.out.println("this is the Original Array");
        // print the array
        for(int i = 0; i<a.length;i++){
            System.out.println(a[i]);

        }
        // selection sort
        for(int i = 0; i<a.length-1;i++){
            int smallest = i;
            for(int j= i+1; j<a.length; j++){
                if(a[smallest] > a[j]){
                    smallest = j;



                }

            }
            int temp = a[smallest];
            a[smallest] = a[i];
            a[i] = temp;


            

        }
        System.out.println("sorted array");
        for(int i = 0; i<a.length;i++){
            System.out.println(a[i]);

        }

    }
}
