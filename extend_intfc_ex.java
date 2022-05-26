 interface  firstintfce {
    public  void calc();
}
 interface secondintfce extends firstintfce{
    public void calc2();
}


class extend_intfc_ex_cls implements secondintfce{

    public void calc2() {
        System.out.println("from class calc2"+2*3);
    }
    public void calc(){
        System.out.println("Testing");
    }

}

public class extend_intfc_ex {
    public static void main(String args[]) {
        extend_intfc_ex_cls myobj = new extend_intfc_ex_cls();
        myobj.calc2();
        myobj.calc();

    }

}