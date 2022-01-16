package Innerclass;

public class Innerclassdemo {

		// TODO Auto-generated method stub
private String msg = "Hi! Welcome to Banglore";
		
		
		void display() {
			class Inner {
				void msg() {
					System.out.println(msg);
				}
			}
			
			Inner innerObj = new Inner();
			innerObj.msg();
		}
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Innerclassdemo demo = new Innerclassdemo();
			demo.display();

	}

}
