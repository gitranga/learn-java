class multithred extends Thread {
    public void run()
    {
            System.out.println(
                    "Thread " + Thread.currentThread().getId()
                            + " is running");
    }
}


public class multithrd {
    public static void main(String[] args)
    {
        for (int i = 0; i < 10; i++) {
            multithred thrdobj
                    = new multithred();
            thrdobj.start();
        }
    }
}