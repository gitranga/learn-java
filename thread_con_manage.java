import java.util.*;
public class thread_con_manage extends Thread {
    public static int number = 0;

    public static void main(String[] args) throws Exception {
        thread_con_manage threadobj  = new thread_con_manage();
        threadobj.start();
        System.out.println(number);
        System.out.println(threadobj.getState());

        while (threadobj.isAlive()) {

            System.out.println("Waiting for thread execution to be completed");
            System.out.println(threadobj.getState());
        }
             number++;
           System.out.println(number);
    }

    public void run() {
 for ( int i=1;i<=1000;i++) {
     System.out.println(i);
 }
        number++;
    }

}
