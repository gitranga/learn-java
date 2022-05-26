import java.util.Random;

public class math_operations {
    public static void main ( String args[]){
        int num1 = 100;
        int num2 = 200;
        double dnum = 1;
         System.out.println(Math.max(num1,num2));
         System.out.println((Math.exp(dnum)));
        System.out.println(Math.min(num1,num2));
        System.out.println(Math.sqrt(num1));
        int num = -20;
        System.out.println(Math.abs(num));

        int randintger = (int) Math.random() * 50 ; // random number between
        System.out.println(randintger);

       int num_bet_num1_and_num2 =  (int) ((Math.random() * (num2 - num1)) + num1);
       System.out.println(num_bet_num1_and_num2);



    }
}
