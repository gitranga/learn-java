public class thread_example extends Thread {

    public static void main(String[] ags){

        thread_example threadobj = new thread_example();
        threadobj.start();
        System.out.println("Main program running");
        threadobj.test();

    }

    public void run(){
        System.out.println("Inside thread");
    }

    public void test(){
        System.out.println("Inside test method");
    }
}
