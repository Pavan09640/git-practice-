package collections;

import java.util.HashSet;
import java.util.Set;
public class Classdemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set = new HashSet<String>();
		
		set.add("Anjira");
		set.add("Badham");
		set.add("pista");
		set.add("beans");
		
		for( String i:set) {
			
			System.out.println(i);
			
		}

	}


}
