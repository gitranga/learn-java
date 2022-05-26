import javax.swing.*;

public class class_cons_ex1 {
    int x=1000;

     public class_cons_ex1(){
        System.out.println("Constructor executed");
        x=200;
    }
    public static void main (String args[]){
       class_cons_ex1 class_obj = new class_cons_ex1();

       System.out.println(class_obj.x);

    }
}
