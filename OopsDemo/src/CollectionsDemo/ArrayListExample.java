package CollectionsDemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		// Create list of Books
		List<Book> blist=new ArrayList<Book>();
		
		//Creating Books
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
        
        // Add Books to List
        blist.add(b1);
        blist.add(b2);
        blist.add(b3);
        
        //Traverse a list
        System.out.println("********** Book Details **********");
        for(Book i:blist)
        {
        	System.out.println(i.id+" "+i.name+" "+i.author+" "+i.publisher+" "+i.quantity);
        }
        
        System.out.println("Total no. of books :"+blist.size());

	}

}
