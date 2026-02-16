package Assignment14;

import java.util.HashMap;
import java.util.Map;

public class IterateHashMap {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Karnti");
        map.put(2, "Aditi");
        map.put(3, "Advik");

       
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() +
                               ", Value: " + entry.getValue());
        }
    }
}

