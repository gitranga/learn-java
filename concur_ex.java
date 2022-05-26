
public class concur_ex extends Thread {
    public static int number = 0;

    public static void main(String[] args) throws Exception {
        concur_ex thread = new concur_ex();
        thread.start();
        System.out.println(number);
       sleep(100);
        if (number>0)
        {
            number++;
            System.out.println("number value more than 1 because of thread execution");
        }
        System.out.println(number);
    }

    public void run() {
        number++;
    }
}