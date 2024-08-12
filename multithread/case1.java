
// create a thread class
public class case1 extends Thread {
    // override run method
    public void run() {
        System.out.print("first set");
    }

    public static void main(String args[]) {
        // create an object of the class
        case1 c = new case1();
        // start the thread
        c.start();

    }
}
