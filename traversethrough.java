import java.util.HashMap;

public class traversethrough {
    
    public static void main(String[] args){

        HashMap<String,String> hasmapobject = new HashMap<String,String>();
        hasmapobject.put("India","Delhi");
        hasmapobject.put("USA","DC");
        hasmapobject.put("England","London");

        for (String countries: hasmapobject.keySet()
             ) {
            System.out.println(countries);
            
        }
        for (String cities: hasmapobject.values()
        ) {
            System.out.println(cities);

        }
    }
    
}
