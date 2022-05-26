import java.util.HashMap;

public class hasmap_methods {

    public static void main(String args[]){

        HashMap<String, String > hashmapobject = new HashMap<String,String>();
        HashMap<String, String > hashmapobject1 = new HashMap<String,String>();

        hashmapobject.put("Virginia","Richmond");
        hashmapobject.put("California","Sacramento");
        System.out.println(hashmapobject);
        String hashmapobjectvalue = hashmapobject.get("California");
        System.out.println(hashmapobjectvalue);
        hashmapobject.remove("Virginia");
        System.out.println(hashmapobject);
         System.out.println(hashmapobject.clone());

        if( hashmapobject.containsKey("California")){
            System.out.println("The hashmap contains the key value pair California");
        }
        System.out.println(hashmapobject.size());

        hashmapobject.clear();
        System.out.println(hashmapobject.size());

    }
}
