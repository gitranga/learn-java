public class switch_example {
    public static void main (String args[]){

        String name_var = "test";

        switch(name_var){
            case "Ranga" : System.out.println("Name is right");
            break;
            case "test" : System.out.println("Name not right");
            break;
            default: System.out.println("No selection exist");
        }

    }
}
