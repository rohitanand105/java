package dsa.array;



public class bubblesort {
    public static void main(String args[]){
        int a[]= {12,15,86,43,96,82,16,67};
        System.out.println("This is the original array");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        // bubblesort
        for(int i=0; i<a.length;i++){
            for(int j= 0; j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    // Swap
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;

                }
            }


        }
        System.out.println("Sorted Array");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }
}
