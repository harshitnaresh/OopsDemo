package NewFeatures;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

// Using Lambda Expressions to iterate in Map
public class LambdaInMath {

	public static void main(String[] args) {
		
		Map <String, String> books = new HashMap <> ();
        books.put("Let Us C", "Yashwant Kanetkar");
        books.put("Object Oriented Programming using Java", "Simon Kendal");
        books.put("Java: Graphical User Interfaces", "David Etheridge");
        
        books.forEach((key,value)-> System.out.println("Book Name :"+key+" - Author:"+value));
    
        System.out.println("--------- Normal Way to Traverse a Map --------");
        for(Entry<String,String> e:books.entrySet())  // for -in loop Java S
        {
        	System.out.println(e.getKey()+" "+e.getValue());
        }
		
	}

}
