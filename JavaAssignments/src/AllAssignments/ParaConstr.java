package AllAssignments;

public class ParaConstr 
{
	String name,n;
	int age,s1m=0,s2m,s3m,a;
	char section,s;
	char gender,g;
	float total;
	float percentage;
	
	ParaConstr(String name,int age,int s1m,int s2m, int s3m,char section,char gender)
	{
		 total=(s1m+s2m+s3m);
		 percentage=(total/300)*100;
		 n=name;
		 a= age;
		 s=section;
		 g=gender;
		
	}
	ParaConstr(String name,int age,int s2m, int s3m,char section,char gender)
	{
		 total=(s1m+s2m+s3m);
		 percentage=(total/300)*100;
		 n=name;
		 a= age;
		 s=section;
		 g=gender;
	}
void display()
{
	System.out.println("student name is " +n +" age:"+a+" section:"+s+" gender:"+g+" total:"+total+" percentage:"+percentage);
	
}
	public static void main(String[] args) 
	{
		ParaConstr s1=new ParaConstr("harish",16,98,76,70,'A','M');
		s1.display();
		ParaConstr s2=new ParaConstr("vetri",20,72,69,'B','M');
		s2.display();
		ParaConstr s3=new ParaConstr("abinaya",19,74,99,'C','F');
		s3.display();
		ParaConstr s4=new ParaConstr("poorna",17,66,96,95,'D','F');
		s4.display();
	}

}

