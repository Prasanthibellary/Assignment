package Arrayofstring;
import java.util.ArrayList;
import java.util.Iterator;
public class Arrayofstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> list = new ArrayList<String>();
	      //Instantiating an ArrayList object
	      list.add("JavaFX");
	      list.add("Java");
	      list.add("c#");
	      list.add("Python");
	      list.add("Hadoop");
	      list.add("Sql");
	      list.add("Java Script");
	      list.add("Impala");
	      System.out.println("Contents of the array list: ");
	      for (String element : list){
	         if (element.contains("Java")){
	               System.out.println(element);
	         }
	      }
	}

}
