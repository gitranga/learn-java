import  java.util.Scanner;

public class java_methods_exam2_calc {

    public static String calc(int first, int second, int thrd, String str, char oper){
        int result = 0;
        if (oper=='*'){
            result = first * second;
        }
        if (oper == '+') {
            result =  first + second;
        }
        if (oper=='-'){
            result = first-second;
        }
        if (oper=='/'){
            result = first/second;
        }
        return  str+result;
    }

    public static void main(String args[]){
        Scanner input_val = new Scanner(System.in);
        int first_num = input_val.nextInt();
        int second_num = input_val.nextInt();
        int third_num = input_val.nextInt();
        String answr = "Asnwer";
        // add values
        String obtained_result;
        obtained_result = calc(first_num,second_num,third_num,answr,'+');
        System.out.println(obtained_result);
        // multiply
        obtained_result  = calc(first_num,second_num,third_num,answr,'*');
    System.out.println(obtained_result);
    }
}
