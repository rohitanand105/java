// doing multiple task from multiple thread.

// First thread
class Mythread1 extends Thread {
    // Override the run method

    public void run() {
        System.out.print("First set\n");

    }
}

// Second thread
class Mythread2 extends Thread {
    // Override the run method
    public void run() {
        System.out.print("Second set\n");
    }
}

// Third Thread
class Mythread3 extends Thread {
    // Override the run method
    public void run() {
        System.out.print("Third set\n");
    }
}

public class case4 {

    public static void main(String args[]) {
        // Create an object of the First thread.
        Mythread1 first = new Mythread1();

        // Start the thread for execution.
        first.start();
        // Create an object of the Second thread.
        Mythread2 second = new Mythread2();

        // Start the thread for execution.
        second.start();
        // Create an object of the Third thread.
        Mythread3 third = new Mythread3();

        // Start the thread for execution.
        third.start();

    }
}
