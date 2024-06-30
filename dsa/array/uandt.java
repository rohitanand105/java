package dsa.array;

public class uandt {
    public static void main(String args[]) {
        int a[] = { 2, 4, 8, 4, 6, 8, 10 };
        int b[] = { 1, 3, 7, 1, 9, 5, 7, 9 };
        System.out.println("This is the union of two arrays");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

            for (int j = 0; j < b.length; j++) {
                if (b[j] != a[i])
                    System.out.println(b[j]);

            }
        }
    }
}
