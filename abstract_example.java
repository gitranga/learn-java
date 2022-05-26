abstract class absclass{

    abstract void absclassmthd();

}
public class abstract_example extends absclass {
    @Override
    void absclassmthd(){
        System.out.println("Over ride - Abstract method constructor ");
    }
    public static void main(String args[]){

      // absclass objabsclass = new absclass();
     abstract_example  absobj = new abstract_example();
       absobj.absclassmthd();



    }

}
