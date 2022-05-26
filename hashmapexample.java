import java.util.HashMap;

public class hashmapexample {

    public static void main(String[] ags){

        HashMap<String, String> hashmapObj = new HashMap<String, String>();
        System.out.println(hashmapObj);
        hashmapObj.put("Aisle 1","Sweets");
        hashmapObj.put("Aisle 2","Vegetables");
        hashmapObj.put("Aisle 3","Pet food");
        System.out.println(hashmapObj);
        String valueinHasp = hashmapObj.get("Aisle 1");
        System.out.println(valueinHasp);
    }

}
