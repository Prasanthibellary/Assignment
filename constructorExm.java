package Constructor;
class Vehicle {
	
	private int id; 
	private String s; 
	
	static String s2;
	
	
	Vehicle(int id, String s) {
		
		this.id = id;
		this.s = s;
		System.out.println("Constructor is invoked");
	}
	
	public int getId() {
		return this.id;
	}
	
}


class A {
	
	A() {
		super();
		System.out.println("A is invoked");
	}
}

class B  extends A {
	public B() {
		super();
		System.out.println("B is invoked");
	}
}



class EmpInfo {
	
	int id ;
	String name;
	
	void display() {
		int a = 5;
		System.out.println(this.id+" "+this.name);
	}
	
	public EmpInfo(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
}

public class constructorExm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
EmpInfo empInfo = new EmpInfo(1, "Kuttyraja");
		
		empInfo.display();
		//empInfo.toString();
		
		B b = new B();
	}

}
