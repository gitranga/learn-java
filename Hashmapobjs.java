import java.util.HashMap;

public class Hashmapobjs {
    public static void main(String[] ags){
        HashMap<String,Integer> hashMapobj = new HashMap<String,Integer>();
        HashMap<String, Boolean> hashMapobj1= new HashMap<String,Boolean>();

        hashMapobj.put("John",5);
        hashMapobj.put("Ed",6);
        hashMapobj.put("Tom",7);
        hashMapobj1.put("Kelly",Boolean.TRUE);
        hashMapobj1.put("John",Boolean.FALSE);


       int height = hashMapobj.get("John");
       System.out.println(height);

       System.out.println(hashMapobj1);


    }
}
