package com.demo;

public class ClassJava {
public static void main(String args[]) {
		
		System.out.println("Default Constructor invoked");
		
		Obj obj = new Obj();
		obj.id=12;
		obj.name="Pavan";
		obj.show();
		
		System.out.println("------------------------");
		
		System.out.println("Parameterized constructor invoked");
		
		Obj obj1 = new Obj(14,"NAGA raju");
		
		obj1.show();
		
	}

}
class Obj{
	int id;
	String name;
	
	public Obj() {
		
	}
	public Obj(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	public void show() {
		System.out.println("id :"+ id + " "+ "name :" + name);
	}
}
