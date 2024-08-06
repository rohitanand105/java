package multithread;

// 1. First step
class now extends Thread
{
    // 2. override the run method.
    public void run(){
        //thread task
        for(int i = 0; i<5; i++){
            System.out.println("thread");
        }
    }
}

class prac {
    public static void main(String args[]){
        // 3. create and object of the class
        now a= new now();
        // 4. Start the thread.
        a.start();


    }    
}
