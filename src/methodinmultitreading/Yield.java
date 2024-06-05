package methodinmultitreading;

public class Yield extends Thread {

	@Override
	public void run() {
		Thread.yield();
		for(int i=0; i<5; i++) {
			System.out.println("&");
		}
		
	}
	public static void main(String[] args) {
		Yield y= new Yield();
		y.start();
		//Thread.yield();
		for(int i=0; i<5; i++) {
			System.out.println("@");
		}
	}
	

}
