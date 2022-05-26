import java.util.Scanner;

public class scope_variable_cls_blk_mthd {

    static int  inClsValue = 100;

    public void setValue(int intInputvalue){
        int inMthdValue = intInputvalue;
        System.out.println(inMthdValue);
        System.out.println(inClsValue);
    }
    public static void main(String args[]){
        Scanner inpvalueobj = new Scanner(System.in);
        int inpvalue = inpvalueobj.nextInt();
        inClsValue = inpvalue;
        System.out.println(inClsValue);

        // System.out.println(inMthdValue);
        {
            int intBlkVar = 200;
            System.out.println(intBlkVar);
        }
      //  System.out.println(intBlkVar);

    }
}
