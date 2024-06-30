
// package multithread;
class NamePrinter extends Thread {
    private String name;

    // Constructor to set the name
    public NamePrinter(String name) {
        this.name = name;
    }

    // Override the run method to print the name
    public void run() {
        for (int i = 0; i <= 50; i++) {
            System.out.println(i);
            System.out.println( name);
        }
    }
}



public class how {
    public static void main(String args[]) {
        NamePrinter t1 = new NamePrinter("Rohit");
        NamePrinter t2 = new NamePrinter("Ajay");

        // Start the threads
        t1.start();
        t2.start();

        for (int i = 0; i <= 50; i++) {
            System.out.println("Make");
        }

        }
    }

