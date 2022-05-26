import java.util.Arrays;
import java.util.Random;
public class array_manipulation {

     public static void main(String[] args) {
         String [] str_array =  {"Pineapple","Blue berries","Straw Berries","Kiwi"};
         //first item of the array
         System.out.println(str_array[0]);
         System.out.println(str_array[str_array.length-2]);
         // Last item of the array
        System.out.println(str_array[str_array.length-1]);
         // Random value from the array
         int randvalue = new Random().nextInt(str_array.length);
         String str_var = str_array[randvalue];
         System.out.println(randvalue+ " " +str_var);
         //Add new item to the array
         String [] new_str_array = Arrays.copyOf(str_array,str_array.length+1);
         new_str_array[new_str_array.length-1] = "Mango";
         System.out.println(new_str_array[new_str_array.length-1]);
        // compare arrays
         boolean bCompare_Result = Arrays.equals(new_str_array,str_array);
         System.out.println("Compared  :"+bCompare_Result);


    }
}
