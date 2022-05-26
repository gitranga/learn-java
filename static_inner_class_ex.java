class outclass {
      int number=200;

    static class nesteclass {
        int number2 = 100;
    }
}

public class static_inner_class_ex {

    public static void main(String[] ags) {


        outclass outclassobj = new outclass();

        outclass.nesteclass nestedobj = new outclass.nesteclass();

        System.out.println(nestedobj.number2);

    }
}
