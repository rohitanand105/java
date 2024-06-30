package extra;
import java.util.*;

public class even {
    public static void main(String args[]) {
        System.out.println("To check even and odd");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any number");
        int a = s.nextInt();

        if (a % 2 == 0) {
            if (a >= 2 && a <= 5) {
                System.out.println("Not Weird");

            }
            if (a >= 6 && a <= 20) {
                System.out.println("Weird");
            }
            if (a > 20) {
                System.out.println("Not Weird");
            }

        } else {
            System.out.println("Wierd");
        }
    }
}
