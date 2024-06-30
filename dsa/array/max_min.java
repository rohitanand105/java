package dsa.array;

public class max_min {
    public static void main(String args[]) {
        int a[] = new int[5];
        a[0] = 244;
        a[1] = 123;
        a[2] = 258;
        a[3] = 48;
        a[4] = 59;

        System.out.println("This is the max number in Array:");
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];

            }
        }

        System.out.println(max);
        System.out.println("This is the minimum Number: ");
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];

            }
        }
        System.out.println(min);

    }
}
