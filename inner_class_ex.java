 class outclass_ex{
    int number = 100;
    public void mthd(){
        System.out.println("method in topclass");
    }
    class nested_class{
        int number2 = 200;

        public void  mthodiner(){
            System.out.println(" method inner class");
        }
    }
}

public class inner_class_ex {
    public static void main(String args[]){
        outclass_ex outclassObj = new outclass_ex();

        outclass_ex.nested_class inclassobj = outclassObj.new nested_class();
        outclassObj.mthd();
        inclassobj.mthodiner();
        System.out.println(outclassObj.number );
        System.out.println(inclassobj.number2);

    }

}
