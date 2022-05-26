import java.util.Scanner;

public class cons_param {
    int number;

    public cons_param (int inp_num) {
        number = inp_num;
        System.out.println("Constructor Executed");
    }

    public static void main( String args[]){
        Scanner inp_val_obj = new Scanner(System.in);
        int inp_value = inp_val_obj.nextInt();
        cons_param cons_parm_obj = new cons_param(inp_value);
        System.out.println(cons_parm_obj.number);


    }

}
