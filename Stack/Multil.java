import java.util.*;
public class Multil{
    public static void main(String args[]){

        Multi m1= new Multi();
        m1.start();

        Simple s = new Simple();
        Thread t1= new Thread(s);
         t1.start();  

    }
}
class Multi extends Thread{
    public void run(){
        System.out.println(" class thread is running");
    }
}



class Simple implements Runnable{
    public void run(){
        System.out.println(" interface thread is running");
    }
}

