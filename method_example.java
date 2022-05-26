public class method_example {
    public static void add() {
        int a = 100 , b =200;
        int result = a + b;
        System.out.println("Result "+result);
    }

    public static void main(String args[]){
        method_example method_example_obj = new method_example();
        method_example_obj.add();
        add();

    }
}
