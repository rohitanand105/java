// create an thread class
public class case2 extends Thread {
    public void run(){
        // give task to the thread
        System.out.print("first set\n");
    }
    public static void main(String args[]){
        // create an object of the class
        case2 f = new case2();
        // start the thread
        f.start();
        // create another object from the same class
        case2 g = new case2();
        //start next thread

        g.start();

    }
}
