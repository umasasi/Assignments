package AllAssignments;

public class StrBuffer {

	public static void main(String[] args) 
	{
		
		StringBuffer i= new StringBuffer("Started Java");
		i.insert(7, " Language");
		System.out.println("Insertion: "+i);
		i.append("Phase1");
		System.out.println("Append: "+i);
		i.delete(2, 5);
		System.out.println("Delete: "+i);
		i.replace(8,11,"Python");
		System.out.println("Replace: "+i);
		i.reverse();
		System.out.println("Reverse: "+i);
		i.charAt(9);
		System.out.println("Char At Index 9: "+i);
	}

	
		

	}


