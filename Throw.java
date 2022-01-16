package Exception;

public class Throw {
	  static void avg()
	  {
	    try
	    {
	      throw new ArithmeticException("demo");
	    }
	    catch(ArithmeticException e)
	    {
	      System.out.println("Exception caught");
	    }
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    avg();
	}

}
