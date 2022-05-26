import java.util.Scanner;
import java.io.*;

public class cons_over_load {
        int number;
        public cons_over_load (int inp_num) {
            number = inp_num;
            System.out.println("Constructor with parrameters Executed");
        }
        public cons_over_load () {
            number = 1000;
            System.out.println("Constructor with no parameters Executed");
        }
    public cons_over_load (int inp_num, int num2 ) {
        number = 1000;
        int result = inp_num + num2;
        System.out.println("Constructor with two parameters/arguments Executed");
        System.out.println(result);
    }
        public static void main( String args[]){
            Scanner inp_val_obj = new Scanner(System.in);
            int inp_value = inp_val_obj.nextInt();
            cons_over_load cons_parm_obj = new cons_over_load(inp_value);
            System.out.println(cons_parm_obj.number);
            cons_over_load cons_parm_second_obj = new cons_over_load();
            System.out.println(cons_parm_second_obj.number);
            cons_over_load cons_third = new cons_over_load(inp_value,100);

        }

    }


