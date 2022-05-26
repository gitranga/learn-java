import java.util.HashSet;

public class setimplementation_ex {

    public static void main(String[] args){

        HashSet<Integer> inobjsetobj = new HashSet<Integer>();
        HashSet<Integer> inobjsetobj2 = new HashSet<Integer>();
        HashSet<Integer> inobjsetobj3 = new HashSet<Integer>();
        HashSet<Integer> inobjsetobj4 = new HashSet<Integer>();

        inobjsetobj.add(1); inobjsetobj.add(3);inobjsetobj.add(5);inobjsetobj.add(11);
        inobjsetobj2.add(2);inobjsetobj2.add(3);inobjsetobj2.add(3);inobjsetobj2.add(10);

        System.out.println(inobjsetobj2);
        inobjsetobj2.addAll(inobjsetobj);

        System.out.println(inobjsetobj2);

        inobjsetobj3.add(1); inobjsetobj3.add(3);inobjsetobj3.add(5);inobjsetobj3.add(11);
        inobjsetobj4.add(2);inobjsetobj4.add(3);inobjsetobj4.add(3);inobjsetobj4.add(10);

        System.out.println(inobjsetobj3);

        System.out.println(inobjsetobj4);

        inobjsetobj4.retainAll(inobjsetobj3);
        System.out.println(inobjsetobj4);



    }

}
