
public class Thred_interface  implements Runnable {

    public static void main(String[] args){
        Thred_interface throbj = new Thred_interface();
        Thread thread = new Thread(throbj);
        thread.start();
        System.out.println("Main code");
    }
    public void run(){
        System.out.println("Inside Thread");
    }
}
