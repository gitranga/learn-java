  class fexample {
    int number = 200;
    final int number2 =300;
    public void fexample(){
        System.out.println("Final usage");
    }

}

public class final_class_example extends  fexample{

    public static void main(String args[]){
        System.out.println("In the main class");
        fexample fexampleobj = new fexample();
        fexampleobj.number = 1000;
       // fexampleobj.number2 = 200;

    }

}