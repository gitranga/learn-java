public class static_example {
    static int number = 100;
    static int number2;
     static int nonstat =100;

    public static class static_nested_class{
        static int inside_stat_class_num = 1000;

    }

    static {
        System.out.println("Inside static block");
        number2=number + 10;
        nonstat = 1000;
    }

    public static void  main(String args[]){
        System.out.println("Main method ");
        System.out.println("Static member vlaue"+number);

        System.out.println("Static class member variable"+static_nested_class.inside_stat_class_num);
        System.out.println("Value of static block variable"+number2);

    }

}
