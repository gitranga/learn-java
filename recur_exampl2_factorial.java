import java.util.Scanner;
public class recur_exampl2_factorial {
    public static int fact(int inpvalue){
        if (inpvalue>=1){
            return inpvalue* fact(inpvalue-1);
        }
        else { return 1; }
    }
    public static void main(String args[]){
        Scanner invalueobj = new Scanner(System.in);
        int inpvalue = invalueobj.nextInt();
        int result = fact(inpvalue);
        System.out.println(result);
    }

}
