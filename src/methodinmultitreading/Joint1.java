package methodinmultitreading;

public class Joint1 extends Thread {
  static  Thread mainthread;
	@Override
	public void run() 
	
	{
	  try {
		mainthread.join();
		for(int i=0; i<5; i++) {
			System.out.println("@");
		}
		
	} catch (InterruptedException e) {
	
		e.printStackTrace();
	}
		
		
			}
	public static void main(String[] args) {
		 mainthread=Thread.currentThread();
		Joint1 j1= new Joint1();
		j1.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("%");
		}
	}
	

}
