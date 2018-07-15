package javafnovrload;
import java.util.*;

public class javafnovrload {
    private int  classlvlInt = 100;
    public  javafnovrload(){
        System.out.println("Constructor method executed");
        
    }
    
    public static int overloadfunc(int a , int b ){
        return a +b;
    }
    
    public static int overloadfunc(int a, int b , int c ) {
        return a+b+c;
    }
        
    public static void main (String args[]) {
        
        javafnovrload funcoverloadObj = new  javafnovrload();
        
        int twoparmfunc = funcoverloadObj.overloadfunc( 10,20);
        twoparmfunc = twoparmfunc + funcoverloadObj.classlvlInt;
        int threeparmfunc = funcoverloadObj.overloadfunc(10,20,30);
        
        System.out.println(" Result of two parm function  " + twoparmfunc );
        System.out.println(" Result of three parm function  " + threeparmfunc );
        
    }
    
    
}  