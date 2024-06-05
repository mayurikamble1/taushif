package multithreading;

public class CreateThread extends Thread{

	@Override
	public void run() {
		for(int i=0; i<5;i++ ) {
			System.out.println(i);
		}
		
	}
	public static void main(String[] args) {//main thread
		//Thread.currentThread().setName("mayur");
		System.out.println(Thread.currentThread().getName());
		CreateThread ct= new CreateThread();//thread 0
		
		ct.start();
		CreateThread ct1= new CreateThread();//thread 1
		ct1.start();
	}
	
}


