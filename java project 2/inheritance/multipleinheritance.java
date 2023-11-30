package inheritance;

class Generators {
public Generators(){
System.out.println("Class Generators ");
}
public void MotorType() {
System.out.println("Motor Type: Genertor");
}
}
class MechanicalGenerator extends Generators {
public MechanicalGenerator() {
System.out.println("Class MechanicalGenerator");
}
public void type() {
System.out.println("Category - MechanicalGenerator");
}
}
class eletricalgenerator extends MechanicalGenerator  {
public eletricalgenerator() {
System.out.println("Class eletricalgenerator");
}
public void motor_type() {
System.out.println("generator type-motor");
}
}

public class multipleinheritance {
	public static void main(String args[]) {
		eletricalgenerator obj= new eletricalgenerator();
		obj.MotorType();
		obj.type();
		obj.motor_type();
		
	}

}
