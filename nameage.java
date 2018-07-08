import java.util.Scanner;
public class nameage{
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the name of the person ");
        String myname = myScanner.nextLine();
        System.out.println("Enter Age");
        int Integ = myScanner.nextInt();
        System.out.println("Ther person " + myname +"'s age "+ Integ );
        
    }

}