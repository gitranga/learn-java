interface  firstinfc{
    public void test();
}

class intfc_classexample implements firstinfc {
    public void test(){
        System.out.println("Signature defined");
    }
}

public class intfc_class{
    public static void   main ( String args[]){
        intfc_classexample infcobj = new intfc_classexample();
        infcobj.test();
    }
}
