public class final_example {
    final int value = 100;
    int a = 1;
    public static void main(String args[]){
        final_example final_obj = new final_example();
        //final_obj.value=200;
        final_obj.a=100;

        System.out.println("Final example "+final_obj.value);
        System.out.println(final_obj.a);
    }
}
