package methodinmultitreading;
//it is run backgound another thread
//use for service to the thread
//eg garbed collection finalized 
//daemon thread write before the start method otherwiseIllegigle thread exception
// not create main method as daemon thread
//if you not write inside main method it will be not gives any out put
public class DaemonThread extends Thread {

	@Override
	public void run() {
		System.out.println("hi mayuri");
	}
	public static void main(String[] args) {
		System.out.println("program end");
		DaemonThread dt =new DaemonThread();
		dt.setDaemon(true);
		dt.start();

		
	}

}
