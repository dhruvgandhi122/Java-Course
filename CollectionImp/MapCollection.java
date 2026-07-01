

import java.util.HashMap;
import java.util.Map;

public class MapCollection {
    public static void main(String[] args) {
        Map<String,Integer> hm = new HashMap<>();
        hm.put("Divyesh", 90);
        hm.put("Himanshu",55);
        hm.put("Rahul",44);
        hm.put("Ashish", 59);
        hm.put("Harsh", 75);
        hm.put("Ram",25);
        System.out.println(hm);
        System.out.println();
        System.out.println("Printing the keyset:");
        System.out.println(hm.keySet());
        System.out.println();
        System.out.println("Printing using enhanced for loop:");
        for(String key: hm.keySet()){
            System.out.println("key: "+key+" Value: "+ hm.get(hm.keySet()));

        }

    }

    
}