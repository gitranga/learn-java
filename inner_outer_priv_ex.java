 class  outlcass {
         int number=100;

   class nestedclass {
        int  number2 = 1000;
        void mthod1(){
            System.out.println("Private method check access");
        }
 }
}
public  class    inner_outer_priv_ex {
    public static void main(String[] args) {
        outlcass outobj = new outlcass();

        outlcass.nestedclass nestedclassobj = outobj.new nestedclass();
        int a= nestedclassobj.number2;
        nestedclassobj.mthod1();


    }
}


