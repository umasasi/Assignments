package AllAssignments;

public class StringTypeandPool {

	
	public static void main(String[] args) 
	{
		String a="Delhi";
		  String b="Mumbai";
		  String c="delhi";
		  String d=new String("Mumbai");
		  String e=new String("delhi");
		  String f=new String("Hello");
		  if(a==b && a.equals(b)){
			  System.out.println("True");
		  }
		  else{
			  System.out.println("false");
		  }
		  if(d==f && d.equals(f)){
			  System.out.println("True");
		  }else{
			  System.out.println("False");
		  }
		  if(a==b && a.equals(b)){
			  System.out.println("True");
			  }else{
				  System.out.println("False");
			  }
		  if(c==d && c.equals(d)){
			  System.out.println("True");
		  }else{
			  System.out.println("False");
		  }
		  if(f==d && f.equals(d)){
			  System.out.println("true");
		  }else{
			  System.out.println("False");
		  }
		}
		
	}


