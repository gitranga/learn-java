 class inheritme{
    int number = 100;
    protected String class_belongs_to =" inherit me";
    public void parent_method (){
        System.out.println("I am executing from parent class");
    }
 }

public class inheritance_example extends inheritme{
    int number2 =1000;

    public static void   main(String args[]){

        inheritme inheritmeobj = new inheritme();
        System.out.println(inheritmeobj.class_belongs_to);
        inheritmeobj.parent_method();
        inheritance_example extndobj = new inheritance_example();
        System.out.println(extndobj.number2);
        System.out.println(extndobj.number);
        System.out.println(extndobj.class_belongs_to);


    }

}
