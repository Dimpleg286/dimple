package javabasic;

import java.util.HashMap;
import java.util.Map;

public class mapinjava {
	

		// Main driver method
		public static void main(Strings args[])
		{
			// Creating an empty HashMap
			Map<Strings, Integer> hm
				= new HashMap<Strings, Integer>();

			// Inserting pairs in above Map
			// using put() method
			hm.put("a", new Integer(100));
			hm.put("b", new Integer(200));
			hm.put("c", new Integer(300));
			hm.put("d", new Integer(400));

			// Traversing through Map using for-each loop
			for (Map.Entry<Strings, Integer> me :
				hm.entrySet()) {

				// Printing keys
				System.out.print(me.getKey() + ":");
				System.out.println(me.getValue());
			}
		}
	}


