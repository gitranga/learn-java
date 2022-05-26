interface interfacA {
    public void intAmthd();
}

interface interfacB {
    public void intBmthd();
}

interface InterfacAB extends interfacA,interfacB{
    public void intfcAB();
}

public class extnd_mul_intfcs implements InterfacAB {


    public void intAmthd() {
        System.out.println("Interface A methd");

    }

    public void intBmthd() {
        System.out.println("Interface B method");
    }

    public void intfcAB() {
        System.out.println("Interfac AB methodd");

    }

    public static void main(String[] args){
        extnd_mul_intfcs   obj = new extnd_mul_intfcs();

        obj.intAmthd();
        obj.intBmthd();
        obj.intfcAB();

    }
}
