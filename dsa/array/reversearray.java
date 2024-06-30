package dsa.array;

public class reversearray {
    public static void main(String args[]) {
        int a[] = new int[5];

        a[0] = 0;
        a[1] = 8;
        a[2] = 4;
        a[3] = 6;
        a[4] = 7;

        System.out.println("This is the orginal array.");
        for (int i = 0; i < a.length; i++) {

            System.out.println(a[i]);
        }
        System.out.println("This is the reversed array");

        for (int i = a.length - 1; i >= 0; i--) {

            System.out.println(a[i]);

        }

    }
}
