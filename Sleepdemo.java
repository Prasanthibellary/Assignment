package Threadconcepts;
class TestSleep implements Runnable {

	public void run() {
		for(int i=1; i<=50; i++) {
			try {
				Thread.sleep(1000);
			
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
		
	}
	
}

class TestSleep1 implements Runnable {
	public void run() {
		for(int i=51; i<=100; i++) {
			try {
				
				Thread.sleep(1000);
			
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
		
	}
	
}

public class Sleepdemo {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new TestSleep());
		Thread t2 = new Thread(new TestSleep1());
		
		
		t1.start();
		
		t1.join();

		t2.start();
		


	}

}
