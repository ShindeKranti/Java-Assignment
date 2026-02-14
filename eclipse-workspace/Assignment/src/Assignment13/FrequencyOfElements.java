package Assignment13;

import java.util.Hashtable;
import java.util.Map;

public class FrequencyOfElements {

    public static void main(String[] args) {

        int arr[] = {10,20,30,10,20,33,23,22,10,22,40};

        Hashtable<Integer, Integer> hm = new Hashtable<>();

      
        for (int x : arr) {

            if (hm.containsKey(x)) {
                hm.put(x, hm.get(x) + 1);
            } else {
                hm.put(x, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {

            Integer key = entry.getKey();
            Integer val = entry.getValue();

            if (val == 3) {
                System.out.println(key + ":" +val);
            }
        }
    }
record Student2(Integer roll,String name,Float marks) {
		
		
	}
	    
}
