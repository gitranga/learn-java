import java.util.Scanner;

public class recur_exampl1 {
    //Find sum of n natural numbers
    public static int SumOfNaturalNUmbers(int inPValue) {
        if (inPValue > 0) {
            System.out.println(inPValue);
            return inPValue + SumOfNaturalNUmbers(inPValue - 1);
        } else {
            return 0;
        }
    }
    public static void main(String args[]){
        Scanner inpvalobj = new Scanner(System.in);
        int inputValue = inpvalobj.nextInt();
        if  (inputValue>0) {
        int sumofNaturalNums = SumOfNaturalNUmbers(inputValue);
        System.out.println(sumofNaturalNums);
    }
    }
}
