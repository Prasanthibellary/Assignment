package Exception;

public class Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            System.out.println("inside try block");
           
            System.out.println(32 / 2);
        }
       
        catch (ArithmeticException e) {
            
            System.out.println("Arithmetic Exception");
            
        }
        finally {
            
            System.out.println(
                "finally : i execute always.");
	}

}
}
