package Exceptionhandling;
class MyCustomException extends Exception  
{  
    
}  
public class Customexception {

	public static void main(String[] args)
		    {  
		        try  
		        {  
		            // throw an object of user defined exception  
		            throw new MyCustomException();  
		        }  
		        catch (MyCustomException ex)  
		        {  
		            System.out.println("Caught the exception");  
		            System.out.println(ex.getMessage());
	}
		    }
}
