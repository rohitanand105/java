package multithread;

class A implements Runnable{
    public void run(){
        for(int i = 0; i< 5; i++){
            System.out.println("Thread");
        }
    }
}

public class runna {
    public static void main(String args[]){
        A r = new A();
        Thread a = new Thread(r);
        a.start();

    }
}
