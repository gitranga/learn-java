public class thrdmthds extends Thread{

    public void run(){
        System.out.println("Inside thread");

        for ( int i=0;i<5;i++){
            System.out.println("Threads");

            try {
                System.out.println("thread sleep mode");
                thrdmthds.sleep(2000);
                System.out.println("Up now");

            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args){

        thrdmthds thrdmthdsobj = new thrdmthds();

        thrdmthdsobj.start();
        System.out.println("Inside main");
        System.out.println(thrdmthdsobj.getId());
       System.out.println( thrdmthdsobj.getName());
        System.out.println( thrdmthdsobj.getThreadGroup());
        System.out.println( thrdmthdsobj.getState());

    }

}
