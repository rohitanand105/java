class how extends Thread{
    public void run(){

        System.out.print("hello new world");
    }

}

public class project {
    public static void main(String args[]){
        how t = new how();

        t.start();

    }
}
