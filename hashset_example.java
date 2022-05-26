import java.util.HashSet;

public class hashset_example {

    public static void main(String[] args){

        HashSet<String> setobj = new HashSet<String>();

        setobj.add("Treenut");
        setobj.add("Cashew");
        setobj.add("Almonds");

System.out.println(setobj);
     System.out.println(setobj.clone());
     setobj.remove("Cashew");
     System.out.println(setobj);
     System.out.println(setobj.size());
     setobj.clear();
     System.out.println(setobj.size());
        }

    }

