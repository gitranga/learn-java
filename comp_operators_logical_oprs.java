public class comp_operators_logical_oprs {
    public  static void main(String args[]) {
  // And operations
            boolean first_oprnd = false  , second_oprnd=true;
        boolean result = first_oprnd && second_oprnd;
        System.out.println("Testing and operations false and True");
        System.out.println(result);
//Or Operation
        boolean first_oprnd_or = true, second_oprnd_or=true;
        boolean result_or = first_oprnd_or ||  second_oprnd_or;
        System.out.println("Testing OR operations false and True");
        System.out.println(result_or);
// Not operation
        boolean first_oprnd_not=false;
        System.out.println("Negation OR reverse boolean ");
        boolean result_not = !first_oprnd_not;
        System.out.println(result_not);

    }

    }

