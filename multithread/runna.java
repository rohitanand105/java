package multithread;

// 1. Implements the runnable interface.
class A implements Runnable{
    // 2. override the run() method.
    public void run(){
        //Thread task.
        for(int i = 0; i< 5; i++){
            System.out.println("Thread");
        }
    }
}

public class runna {
    public static void main(String args[]){
        // 3. create an object of the class
        A r = new A();
        // 4.  create an object of the thread class and parse the parameter in Constructor as the runnable interface only contains run() method.
        Thread a = new Thread(r);
        // 5. Start the thread.
        a.start();

    }
}
