package AllAssignments;

public class Typecasting {

	public static void main(String[] args) 
	{
		float i = 53.6f;
		long u = (long)i;
		
		long h= 1227485595058l;
		byte g =(byte)h;
		
		double d = 2456677.5673345;
		long s= (long) d;
		int a = (int)s;
		char c = (char) a;
		
		int b=4;
		double f = (double)b;
		long l = (long) f;
		
		
		System.out.println("Actual float value is : " +i);
		System.out.println("After conversion float value to long : " +u);
		
		System.out.println("Actual long value is : " +h);
		System.out.println("After conversion long value to byte : " +g);
		
		System.out.println("Actual double value is : " +d);
		System.out.println("After conversion double value to long : " +s);
		
		System.out.println("Actual long value to int : " +a);
		System.out.println("After conversion int  value to char : " +c);
		
		System.out.println("Actual int value is : " +b);
		System.out.println("After int value to double : " +f);
		System.out.println("After conversion double value to long : " +g);
		
		
		
		
		
	}


	}


