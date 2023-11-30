package com.typecating;

public class ExplicitTypeCasting 
{
	void Explicit() 
	{
		System.out.println("Performing explicit typecating");
		long l1=200;
		byte b1=(byte)l1;
		System.out.println("long value:"+l1);
		System.out.println("byte value:"+b1);
		System.out.println("---------------------");
		
		long l2=150;
		short d=(short)l2;
		System.out.println("long value:"+l2);
		System.out.println("short value:"+d);
		System.out.println("---------------------");
		
		long l3=180;
		double h=l3;
		System.out.println("long value:"+l3);
		System.out.println("double value:"+h);
		System.out.println("---------------------");
		
		float f1=10.999f;
		byte s=(byte)f1;
		System.out.println("float value:"+f1);
		System.out.println("byte value:"+s);
		System.out.println("----------------------");
		
		float f2=90.987f;
		short A=(short)f2;
		System.out.println("float value:"+f2);
		System.out.println("short value:"+A);
		System.out.println("------------------------");
		
        float f3=13.0945f;
        double r=f3;
        System.out.println("float value:"+f3);
        System.out.println("double value:"+r);
        System.out.println("-----------------------");
        
        int p=40;
        byte o=(byte)p;
        System.out.println("int value:"+p);
        System.out.println("byte value:"+o);
        System.out.println("-------------------------");
        
        int u=200;
        short f=(short)u;
        System.out.println("int value:"+u);
        System.out.println("short value:"+f);
        System.out.println("---------------------------");
        
        int t=300;
        double w=t;
        System.out.println("int value:"+t);
        System.out.println("double value:"+w);
        System.out.println("-----------------------------");
        
	}
	public static void main(String[] args) 
	{
		ExplicitTypeCasting obj=new ExplicitTypeCasting();
		obj.Explicit();
		
	}

}
