package AccessModifire;

public class Bike {
	public static int BikeCount;

	 // public method
	 public static void display() {
	     System.out.println("I love BIKE RIDING " );
	     System.out.println("I have " + BikeCount + " Bikes");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b = new Bike();

	     // accessing the public variable
	     Bike.BikeCount = 4;
	     // accessing the public method
	     Bike.display();

	}

}
