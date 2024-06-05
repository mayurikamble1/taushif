package methodinmultitreading;

public class Joint extends Thread {

	@Override
	public void run() {
	for(int i=0; i<5; i++) {
		System.out.println("@");
	}
	}
	public static void main(String[] args) {
		Joint j= new Joint();
		j.start();
		try {
			j.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
		
		for(int i=0; i<4 ; i++) {
			System.out.println(i);
		}
	}
	

}
