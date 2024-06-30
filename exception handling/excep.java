public class excep {
    public static void main(String[] args) {
        try {
            int a = 150;
            int b = 0;
            int c = a / b;
            System.out.println(" Division of c is: " + c);

        } catch (ArithmeticException e) {
            System.out.println("The Reason of exception is: " + e);

        }   finally{
            System.out.println("Program is end Here");

        }

    }

}
