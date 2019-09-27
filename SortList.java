import java.util.*; 

public class SortList { 
	public static void main(String args[]) 
	{ 

		
		ArrayList<String> 
			list = new ArrayList<String>(); 

		
		list.add("Harry"); 
		list.add("Olive"); 
		list.add("Alice"); 
		list.add("Bluto"); 
		list.add("Eugene"); 

		
		System.out.println("Unsorted ArrayList: "
						+ list); 

		
		Collections.sort(list); 

		
		System.out.println("Sorted ArrayList "
						+ "in Ascending order : "
						+ list); 
	} 
} 
