class firstclass {
    private int number =100;
    public int number2 =1000;
    private void firstclassmethod(){
        System.out.println("first class method");

    }
    firstclass(){
        System.out.println(number);
    }
}

public class private_access_mod_ex {

    public static void main(String args[]){
        firstclass objfirstclass = new firstclass();
         System.out.println(objfirstclass.number2);
     //   objfirstclass.firstclassmethod();

    }

}
