interface myintfc {
    public void message();
    final int number = 1000;
    default void cal(int a , int b){
        int c = a*b;
        System.out.println("Default method executed"+c);
        System.out.println("Implementation of default method in interface: The value value defined is "+number);
    }
}

public class intfc_default implements myintfc {

    public void message(){
        System.out.println("Message: implemented the public method ");
    }
    public static void main(String[] ags){
        intfc_default obj = new intfc_default();
        int firstnum =100;
        int secondnum =200;
        obj.message();
        obj.cal(firstnum,secondnum);



    }
}
