package collections;

import java.util.HashMap;
import java.util.Map;

public class ObjDemo {
public static void main(String args[]) {
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(10, "pavan");
		map.put(11, "Hanuma");
		map.put(12, null);
		map.put(13, null);
		
		
		for (Map.Entry<Integer,String> mapElement : map.entrySet()) {
            int key = mapElement.getKey();
 
            
            String value = mapElement.getValue();
 
            
            System.out.println(key + " : " + value);
        }
		
	}

}
