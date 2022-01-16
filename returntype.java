package Returntype;
class A {
}

class B extends A {
}
 
class Base {
 
    A fun()
    {
        // Display message only
        System.out.println("Base fun()");
 
        return new A();
    }
}
class Derived extends Base {
	 
    B fun()
    {
        // Display message only
        System.out.println("Derived fun()");
 
        return new B();
    }
}
public class returntype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base base = new Base();
		base.fun();
		Derived derived = new Derived();
		 derived.fun();
	}

}
