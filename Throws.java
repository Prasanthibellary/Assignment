package Exception;

public class Throws {
	static void check() throws ArithmeticException
	  {  
	    System.out.println("Inside check function");
	    throw new ArithmeticException("demo");
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    try
	    {
	      check();
	    }
	    catch(ArithmeticException e)
	    {
	      System.out.println("caught" + e);
	    }

	}

}
