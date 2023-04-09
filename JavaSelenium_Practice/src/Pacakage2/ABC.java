package Pacakage2;

public class ABC {
	
	public ABC()
	
	{
		this(8,9,10);
		System.out.println("Default Constructor");
	}

	public ABC(int a)
	{
		System.out.println("One paramterized constructor");
	}
	
	public ABC(int a,int b)
	
	{
		
		System.out.println("Two Parameterized constructor");
	}
	public ABC(int a,int b,int c)
	{
		
		System.out.println("Three Parameterized constructor");
	}
	public ABC(int a,int b,int c,int d)
	{
		this(8,9);
		
		System.out.println("Four Parameterized constructor");
	}

public static void main(String[] args) 
{
	ABC obj1=new ABC(); 
	ABC obj2 = new ABC(8,9,10,11);
    ABC obj3=new ABC(8);
	
}
	
}


