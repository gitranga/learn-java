import java.util.Scanner;

public class palindrome_check {

     public static String reversestring( String inpstring,int length){
          String inpstring1;
          if (length>0) {
               System.out.println(inpstring.substring(length,length));
                 inpstring1 = inpstring.substring(length,length);
               return   inpstring1  + reversestring(inpstring,length-1) ;
          }
          return "";
      }

     public static void main(String[] args){

          Scanner Scanobj = new Scanner(System.in);
          String inputstring = Scanobj.next();
          System.out.println(inputstring.length());
         String reversed =  reversestring(inputstring,inputstring.length());

     System.out.println(reversed);

     }

}
