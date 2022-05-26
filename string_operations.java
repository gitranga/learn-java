import java.util.Locale;

public class string_operations {
    public static void main(String args[]){
        String str_val = "John Joe";
        System.out.println(str_val.length());

        System.out.println(str_val.toLowerCase());

        System.out.println(str_val.toUpperCase());

        String str_val_next = "I went to a college ";
        int location = str_val_next.indexOf("is");
        System.out.println(location);

       String string1 = "FirstString";
       String string2 = "Second String";
       String string3 = string1.concat(string2);
       System.out.println(string3);

       System.out.println("printing \n test \t next \"");


    }
}
