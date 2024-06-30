package multithread;


class now extends Thread{
    public void run(){
        for(int i = 0; i<5; i++){
            System.out.println("thread");
        }
    }
}

class prac {
    public static void main(String args[]){
        now a= new now();
        a.start();


    }    
}
