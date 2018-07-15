package learnpackage;

import java.util.*;

class addnum {
    public int addnumber (int a, int b ) {
        int c = a + b;
        return c; 
    }
public static void main (String[] args){
    addnum addtwonumberObj = new addnum();
    Scanner myscan = new Scanner(System.in);
    System.out.println("Enter the first number to add ");
    int anum = myscan.nextInt();
    System.out.println("Enter the second number to add ");
    int bnum = myscan.nextInt();
    int cnum = addtwonumberObj.addnumber(anum,bnum);
    System.out.println("Sum of the two numbers " + cnum );

    // go to the folder where the java file exists and execute the below command. 
    // compiling javac  -d .  learnpackage.java
    // 
    // To execute the public class 
    //java learnpackage.addnum from the parent folder of learnpackage
}
}