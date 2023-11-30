package com.typecating;

public class ImplicitTypeCasting 
{
	void implicit() 
	  {
		System.out.println("Performing implicit type casting");
		int i=50;
		float f=i;
		System.out.println("int value:"+i);
		System.out.println("float value:"+f);
		System.out.println("---------------------------");
		int y=100;
		double d=y;
		System.out.println("int value:"+y);
		System.out.println("double value:"+d);
		System.out.println("-----------------------------");
		
		int x=500;
		long l=x;
		System.out.println("int value:"+x);
		System.out.println("long value:"+l);
	    System.out.println("----------------------------");	
	    
	    byte b=60;
	    float f2=b;
	    System.out.println("byte value:"+b);
	    System.out.println("float value:"+f2);
	    System.out.println("---------------------------");
	    
	    byte v=20;
	    double d2=v;
	    System.out.println("byte value:"+v);
	    System.out.println("double value:"+d2);
	    System.out.println("-----------------------------");
	    
	    byte n=80;
	    long l2=n;
	    System.out.println("byte value:"+n);
	    System.out.println("long value:"+l2);
	    System.out.println("------------------------------");
	    
	    short s=400;
	    float f3=s;
	    System.out.println("short value:"+s);
	    System.out.println("float value:"+f3);
	    System.out.println("------------------------------");
	    
	    short h=500;
	    double d3=h;
	    System.out.println("short value:"+h);
	    System.out.println("double value:"+d3);
	    System.out.println("---------------------------------");
	     
	    short m=300;
	    long l3=m;
	    System.out.println("short value:"+m);
	    System.out.println("long value:"+l3);
	    
}
	public static void main(String[] args)
	{
		ImplicitTypeCasting obj=new ImplicitTypeCasting();
		obj.implicit();

		
	}
	
}