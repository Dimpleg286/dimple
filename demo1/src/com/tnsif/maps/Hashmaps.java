package com.tnsif.maps;

import java.util.HashMap;
import java.util.Set;

public class Hashmaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<String , Integer> obj = new HashMap<>();
obj.put("hyd", 12);
obj.put("blg", 14);
obj.put("MH", 16);


Set<String>key = obj.keySet();
for(String key1 : key){
System.out.println(key1);
	}

}
}