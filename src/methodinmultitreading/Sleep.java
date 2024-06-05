package methodinmultitreading;

public class Sleep extends Thread {

	@Override
	public void run() {
		//System.out.println(Thread.interrupted());
		
		for(int i=0; i<5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
		
				e.printStackTrace();
			}
			System.out.println(i);
		}
			
	
	}
	public static void main(String[] args) {
		Sleep  s= new Sleep();
		s.interrupt();
	s.start();
	s.interrupt();
	//s.interrupt();
	
	
		
	}
	
	
}
