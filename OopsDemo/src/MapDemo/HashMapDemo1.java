package MapDemo;

import java.util.HashMap;

public class HashMapDemo1 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> languages = new HashMap<>();
	    languages.put(1, "Java");
	    languages.put(2, "Python");
	    languages.put(3, "JavaScript");
	    
	    System.out.println("HashMap: " + languages);
	    
	 // get() method to get value
	    String value = languages.get(1);
	    System.out.println("Value at index 1: " + value);
	    System.out.println("Value at index 3: " + languages.get(3));
	    
	    // return set of keys
	    System.out.println("Keys :"+languages.keySet());
	    
	    //return set of values
	    System.out.println("Values : "+languages.values());
	    
	    //return set of key--value pairs
	    System.out.println("key-Value Mappings :"+);

	}

}
