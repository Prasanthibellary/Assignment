package Pack;
import java.util.regex.*;
import java.util.*;
public class Emailvalidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> emails = new ArrayList<String>();
		 emails.add("bellarysweety@domain.co.in");  
	        emails.add("bellaryprasanthi@gmail.com");  
	        emails.add("bellary.prasanthi@domain.com");  
	        emails.add("sweety99@google.co.in");  
	        emails.add("prashusweety99@simplelearn.com");  
	        emails.add("bprasanthi99@domain.com");   
	        emails.add("@Mphasis.com");  
	        emails.add("prasanthiBellary#domain.com");  
	        String regex = "^(.+)@(.+)$";   
	        Pattern pattern = Pattern.compile(regex);    
	        for(String email : emails){	            
	            Matcher matcher = pattern.matcher(email);  
	            System.out.println(email +" : "+ matcher.matches()+"\n");  
	}
	}

}
